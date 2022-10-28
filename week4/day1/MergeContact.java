package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	public static void main(String[] args) {
		// Setting up the driver System.setProperty("webdriver.chrome.driver",
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup(); //Open the browser
		ChromeDriver driver = new ChromeDriver();
		// Launch the web Application
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Maximize the browser
		driver.manage().window().maximize();
		// implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Pass the value to the element using id locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		// Click on Widget of From Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		// Switch control to second window
		Set<String> windowHandles = driver.getWindowHandles();
		// Copy the set into list
		List<String> listHandles = new ArrayList<String>(windowHandles);
		// to move the control to the second window
		driver.switchTo().window(listHandles.get(1));
		System.out.println(driver.getTitle());
		// Click on First Resulting Contact
		String leadId = driver
				.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]"))
				.getText();
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();

		System.out.println(leadId);
		// Get out of window handle
		driver.switchTo().window(listHandles.get(0));
		// Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		// Switch control to second window
		Set<String> windowHandles1 = driver.getWindowHandles();
		// Copy the set into list
		List<String> listHandles1 = new ArrayList<String>(windowHandles1);
		// to move the control to the second window
		driver.switchTo().window(listHandles1.get(1));
		System.out.println(driver.getTitle());
		// Click on First Resulting To Contact
		String leadId1 = driver
				.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody[1]/tr[1]/td[1]/div[1]/a[1]"))
				.getText();
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody[1]/tr[1]/td[1]/div[1]/a[1]"))
				.click();
		System.out.println(leadId1);
		// Get out of window handle
		driver.switchTo().window(listHandles.get(0));
		// Click Merge
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		// switch to alert
		Alert alert = driver.switchTo().alert();
		// Accept the alert
		alert.accept();
		// Verify the title of the page
		System.out.println(driver.getTitle());
	}
}

package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		// Check whether the Filter is applied with Shampoo
		String shampooName = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		if (shampooName == "Shampoo")
			System.out.println("Filter is applied with Shampoo");
		else
			System.out.println("Filter is not applied");
		// Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		// GO to the new window and select size as 175ml
		Set<String> windowHandles11 = driver.getWindowHandles();
		// Copy the set into list
		List<String> listHandles11 = new ArrayList<String>(windowHandles11);
		// to move the control to the second window
		driver.switchTo().window(listHandles11.get(1));
		WebElement clickSize = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select size = new Select(clickSize);
		size.selectByIndex(1);
		System.out.println(driver.getTitle());
		// Print the MRP of the product
		String mrp = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		System.out.println("MRP is " + mrp);
		// Click on ADD to BAG
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		// Go to Shopping Bag
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		// Print the Grand Total amount
		String total = driver.findElement(By.xpath("//div[@class='css-1rd7vky'][1]/div")).getText();
		System.out.println("Grand Total is :" + total);
		// Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		// Click on Continue as Guest

		// Check if this grand total is the same in step 14

		// Close all windows

		
		
	}
}

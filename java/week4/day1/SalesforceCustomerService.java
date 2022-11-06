package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceCustomerService {
	public static void main(String[] args) {
		// Setting up the driver System.setProperty("webdriver.chrome.driver",
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup(); //Open the browser
		ChromeDriver driver = new ChromeDriver();
		// Launch the browser
		driver.get("https://login.salesforce.com");
		// Maximize the browser
		driver.manage().window().maximize();
		// implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		// enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		// click login button
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		// click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("(//div/div/button/span[@dir='ltr'])[2]")).click();
		// Switch to the next window using Windowhandles
		Set<String> windowHandles = driver.getWindowHandles();
		// Copy the set into list
		List<String> listHandles = new ArrayList<String>(windowHandles);
		// to move the control to the second window
		driver.switchTo().window(listHandles.get(1));
		// click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		// Get the title
		System.out.println(driver.getTitle());
		// Get back to the parent window
		driver.switchTo().window(listHandles.get(1));
		// close the browser
		driver.close();
	}
}

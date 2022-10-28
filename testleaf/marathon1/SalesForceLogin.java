package testleaf.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceLogin {
	public static void main(String[] args) throws Exception {
		// Setting up the Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		// manage ur window
		driver.manage().window().maximize();
		// add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Load URL
		driver.get("https://login.salesforce.com");
		// enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		// enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		// click login button
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		// Click on toggle menu button from the left corner
		driver.findElement(By.className("slds-icon-waffle")).click();
		// Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		// Click on Account tab
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", account);
		// Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		// Enter 'your name' as account name
		WebElement account1 = driver.findElement(By.xpath("//input[@name='Name']"));
		account1.sendKeys("Marilakshmi");
		// Select Ownership as Public
		driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));
		// click save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		// verify message
		WebElement name = driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']"));
		String accountName = name.getText();
		if (accountName.contains("Marilakshmi"))
			System.out.println("Account is created");
		else
			System.out.println("Account is not created");

	}
}

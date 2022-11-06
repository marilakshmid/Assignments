package testleaf.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceOppurtunities {
	public static void main(String[] args) throws InterruptedException {
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
		// Click on Opportunity tab
		WebElement oppur = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1] "));
		driver.executeScript("arguments[0].click();", oppur);
		// Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		// Enter 'your name' as account name
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4] ")).sendKeys("Marilakshmi");
		driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]")).sendKeys("Marilakshmi");
		driver.findElement(By.xpath("(//strong[text()='Marilakshmi'])[1]")).click();
		// choose close date
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("10/19/2022");
		// click stage(Needs Analysis)
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		// click save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		// verify message
		WebElement oppurtunities = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		String  oppurtun = oppurtunities.getText();
		if (oppurtun.contains("Marilakshmi"))
			System.out.println("Oppurtunity is created");
		else
			System.out.println("Oppurtunity is not created");
		// Close the Browser
	}
}

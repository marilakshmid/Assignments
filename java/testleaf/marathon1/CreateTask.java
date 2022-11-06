package testleaf.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateTask {
public static void main(String[] args) {
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
			// Click on Global Actions SVG icon(App Launcher)
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			// Click view all
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			//Type task and select task
			driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Tasks");
			driver.findElement(By.xpath("//mark[text()='Tasks']")).click();
			//Click New Task under dropdown icon
			driver.findElement(By.xpath("//a[@class='slds-button slds-button--icon-x-small slds-button--icon-border-filled']")).click();
			driver.findElement(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Task.NewTask']")).click();
			
			//Enter subject as "Bootcamp "   
			driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
			//Select status as 'Waiting on someone else'
			driver.findElement(By.xpath("(//a[text()='Not Started'])[1]")).click();
			driver.findElement(By.xpath("(//a[text()='Waiting on someone else'])[1]")).click();
			//Save and verify the 'Task created' message
			driver.findElement(By.xpath("//span[text()='Save']")).click();
			driver.findElement(By.xpath("//span[@data-aura-rendered-by='1819:0']")).getText();
			System.out.println("Task is created");
			
			
}
}

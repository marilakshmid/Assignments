package testleaf.marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {
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
		// Launch Salesforce application
		driver.get("https://login.salesforce.com/");
		// Login with Provided Credentials
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		// click login button
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		// Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		// to move the control to the second window
		driver.switchTo().window(listHandles.get(1));
		// click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		System.out.println(driver.getTitle());
		// Select SalesForce Certification Under Learnings
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[text()='Learning']").click();

		Actions builder = new Actions(driver);
		WebElement trial = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		builder.moveToElement(trial).build().perform();

		// Click on Salesforce Certifications
		WebElement salesforce = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click();", salesforce);
		System.out.println(driver.getTitle());
		// Choose Your Role as Salesforce Architect
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		// Get the Text(Summary) of Salesforce Architect
		WebElement architect = driver.findElement(By.xpath(
				"//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']"));
		String salesforceArchitect = architect.getText();
		System.out.println(salesforceArchitect);
		// Get the List of Salesforce Architect Certifications Available
		List<WebElement> certificateList = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println("List of Salesforce Architect Certifications are : ");
		for (WebElement certificate : certificateList) {
			System.out.println(certificate.getText());
		}
		// Click on Application Architect
		driver.findElement(By.xpath("//div[@class='credentials-card_title']/a[1]")).click();
		// Get the List of Certifications available
		List<WebElement> certificateList1 = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println("Application Architect are :");
		for (WebElement certificate1 : certificateList1) {
			System.out.println(certificate1.getText());
		}
	}
}

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

public class AdministratorCertifications {
	public static void main(String[] args) {
		// Setting up the Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
//		ChromeOptions ch = new ChromeOptions();
//		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
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
		// Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		// to move the control to the second window
		driver.switchTo().window(listHandles.get(1));
		// click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		System.out.println(driver.getTitle());
		// Mouse hover on Learning On Trailhead
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
		// Click on Ceritification Administrator
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();

		// Navigate to Certification - Administrator Overview window
		System.out.println(driver.getTitle());
		// Verify the Certifications available for Administrator Certifications should
		// be displayed
		List<WebElement> certificatesList = driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
		for (WebElement certificates : certificatesList) {
			System.out.println(certificates.getText());
		}

	}
}

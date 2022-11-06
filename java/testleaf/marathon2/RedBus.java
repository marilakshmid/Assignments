package testleaf.marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
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
		driver.get("https://www.redbus.in/");
		// Type "Chennai" in the FROM text box
		// hint: Sendkeys(Keys.ENTER)
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai", Keys.ENTER);

		// Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore", Keys.ENTER);
		// Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		WebElement search = driver
				.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[3]/td[@class='wd day'][1]"));
		driver.executeScript("arguments[0].click();", search);
		// Click Search Buses
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		System.out.println(driver.getTitle());
		System.out.println("search");
		// Print the number of buses shown as results (104 Buses found)
		WebElement buses = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']"));
		driver.executeScript("arguments[0].click();", buses);
		System.out.println(buses.getText());
		// Choose SLEEPER in the left menu

		// Print the name of the second resulting bus
		// Click the VIEW SEATS of that bus
		// Take screenshot and close browser
	}
}

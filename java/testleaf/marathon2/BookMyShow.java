package testleaf.marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {
	public static void main(String[] args) throws InterruptedException {
		// Setting up the Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		// Launch Edge / Chrome
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		// manage ur window
		driver.manage().window().maximize();
		// add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Load URL
		driver.get("https://in.bookmyshow.com/");
		// Type the city as "Hyderabad" in Select City
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		// Confirm the URL has got loaded with Hyderabad
		System.out.println(driver.getCurrentUrl());
		// Search for your favorite movie
		WebElement search = driver.findElement(By.id("input-search-box"));
		//driver.executeScript("arguments[0].click();", search);
		search.click();
		search.sendKeys("sardar");
		
		// Click Book Tickets
		driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
		// Print the name of the theater displayed first
		driver.findElement(By.xpath("//li[@class='sc-vhz3gb-0 fySqsk']/section[2]//span")).click();
		driver.findElement(By.xpath("(//div[@class='__title'])[1]/a")).click();
		// Click on the info of the theater
		
		// Confirm if there is a parking facility in the theater
		// Close the theater popup
		// Click on the first green (available) timing
		// Click Accept
		// Choose 1 Seat and Click Select Seats
		// Choose any available ticket and Click Pay
		// Print the sub total

	}
}

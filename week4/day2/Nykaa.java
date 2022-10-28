package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	public static void main(String[] args) {
		// Setting up the driver System.setProperty("webdriver.chrome.driver",
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup(); //Open the browser
		ChromeDriver driver = new ChromeDriver();
		// Launch the web Application
		driver.get("https://www.nykaa.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		// implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 1 - locate the element Brands
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		// Step 2 Create object for Action class
		Actions builder = new Actions(driver);
		// Mouseover on Brands and Search L'Oreal Paris
		builder.moveToElement(brands).perform();
		System.out.println("mouseover");
		driver.findElement(By.xpath("//input[@placeholder='search brands']")).sendKeys("L'Oreal Paris");
		WebElement loreal = driver.findElement(By.xpath("//div[@id='scroller-container']/div[2]/a[1]"));
		builder.moveToElement(loreal).click();
		System.out.println("Loreal");
		
		

	}
}

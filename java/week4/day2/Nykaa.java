package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step 1 - locate the element Brands
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		// Step 2 Create object for Action class
		Actions builder = new Actions(driver);
		// Mouseover on Brands and Search L'Oreal Paris
		builder.moveToElement(brands).perform();
		System.out.println("mouseover");
		WebElement loreal = driver.findElement(By.xpath("//input[@id='brandSearchBox']"));
		loreal.sendKeys("L'Oreal Paris");
		WebElement results = driver.findElement(By.xpath("//div[@id='scroller-container']/div[7]/a"));
		results.click();
		// Get Title
		System.out.println(driver.getTitle());
		// Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		// Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		WebElement shampoo = driver.findElement(By.xpath("(//div[@class='control-value'])[1]/span[1]"));
		shampoo.click();
		// Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	}

}

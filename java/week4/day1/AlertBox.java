package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	public static void main(String[] args) {
		// Setting up the driver System.setProperty("webdriver.chrome.driver",
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup(); //Open the browser
		ChromeDriver driver = new ChromeDriver();
		// Launch the web Application
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		// Maximize the browser
		driver.manage().window().maximize();
		// implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// click on prompt button
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		// switch to alert
		Alert alert = driver.switchTo().alert();
		// send input to alert text field
		alert.sendKeys("TestLeaf - Automation");
		alert.accept();

	}
}

package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
public static void main(String[] args) {
	//Setting up the driver System.setProperty("webdriver.chrome.driver",
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup(); //Open the browser
	ChromeDriver driver = new ChromeDriver(); 
	//Launch the web Application
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); 
	//Maximize the browser
	driver.manage().window().maximize();
	//implicit wait for 30 seconds
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Get into the frame
	driver.switchTo().frame("iframeResult");
	//click on Try it button
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	//switch to alert
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Marilakshmi");
	alert.accept();
	String text= driver.findElement(By.id("demo")).getText();
	System.out.println(text);
	
	
	
}
}

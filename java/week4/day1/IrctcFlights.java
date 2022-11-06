package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcFlights {
public static void main(String[] args) {
	//Setting up the driver System.setProperty("webdriver.chrome.driver",
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup(); //Open the browser
		ChromeDriver driver = new ChromeDriver(); 
		//Launch the web Application
		driver.get("https://www.irctc.co.in/"); 
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click sweet alert
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//Click Flights
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		//Copy the set into list
		List<String> listHandles = new ArrayList<String>(windowHandles);
		
		
		//to move the control to the second window
		driver.switchTo().window(listHandles.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.close();
		
		driver.switchTo().window(listHandles.get(0));
		String title1 = driver.getTitle();
		System.out.println(title1);
		
}
}

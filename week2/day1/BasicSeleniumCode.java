package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCode {
	public static void main(String[] args) {

		//Setting up the driver System.setProperty("webdriver.chrome.driver",
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup(); //Open the browser
		ChromeDriver driver = new ChromeDriver(); 
		//Launch the web Application
		driver.get("http://leaftaps.com/opentaps/"); //Maximize the browser
		driver.manage().window().maximize();
		driver.close();

		/*//Setting up the driver
		WebDriverManager.edgedriver().setup();
		//Open the browser
		EdgeDriver driver = new EdgeDriver();
		//Launch the web Application
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser
		driver.manage().window().maximize();
		 */
		/*
		//Setting up the driver
		WebDriverManager.firefoxdriver().setup();
		//Open the browser
		FirefoxDriver driver = new FirefoxDriver();
		//Launch the web Application
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser
		driver.manage().window().maximize();
		 */

		/*//Setting up the driver
		WebDriverManager.iedriver().setup();
		//Open the browser
		InternetExplorerDriver driver = new InternetExplorerDriver();
		//Launch the web Application
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser
		driver.manage().window().maximize();
		//driver.close();*/
	}
}

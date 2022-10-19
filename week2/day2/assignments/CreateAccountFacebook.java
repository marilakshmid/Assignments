package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountFacebook {
	public static void main(String[] args) {
		// Setting up the Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("https://en-gb.facebook.com/");
		// Maximise the window
		driver.manage().window().maximize();
		// Add implicit wait
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Pass the value to the element
		WebElement signup = driver.findElement(By.linkText("Create New Account"));
		signup.click();
		// Enter the first name
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("MariLakshmi");
		// Enter the last name
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Duraipandi");
		// Enter the mobile number
		WebElement mobilenumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobilenumber.sendKeys("marilakshmi09@gmail.com");
		// Reenter the mobile number
		WebElement mobilenumber_reenter = driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
		mobilenumber_reenter.sendKeys("marilakshmi09@gmail.com");
		// Enter the password
		WebElement newPassword = driver.findElement(By.xpath("//input[contains(@autocomplete,'password')]"));
		newPassword.sendKeys("happyLearning");
		// DropDown for day selection
		WebElement daySource = driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		Select day = new Select(daySource);
		day.selectByVisibleText("29");
		// DropDown for month selection
		WebElement monthSource = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		Select month = new Select(monthSource);
		month.selectByValue("12");
		// DropDown for year selection
		WebElement yearSource = driver.findElement(By.xpath("//select[contains(@id,'year')]"));
		Select year = new Select(yearSource);
		year.selectByIndex(0);
		// Gender selection
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
	}
}

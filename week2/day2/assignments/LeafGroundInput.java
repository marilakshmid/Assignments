package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundInput {
	public static void main(String[] args) throws Exception {
		// Setting up the Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("https://www.leafground.com/input.xhtml");
		// Maximize the window
		driver.manage().window().maximize();
		// Type your name
		driver.findElement(By.id("j_idt88:name")).sendKeys("Marilakshmi");
		// Append Country to this City.
		WebElement city = driver.findElement(By.id("j_idt88:j_idt91"));
		city.clear();
		city.sendKeys("Sivakasi");
		// Verify if text box is disabled
		boolean text = driver.findElement(By.id("j_idt88:j_idt93")).isDisplayed();
		System.out.println(text);
		// Clear the typed text.
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		// Retrieve the typed text
		WebElement retrive = driver.findElement(By.id("j_idt88:j_idt97"));
		System.out.println("Retrived text is : " + retrive.getAttribute("value"));
		// Type email and Tab Confirm control moved to next element.
		WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
		email.sendKeys("marilakshmi09@gmail.com", Keys.TAB);
		// Type about yourself
		WebElement type_yours = driver.findElement(By.id("j_idt88:j_idt101"));
		type_yours.sendKeys("Learning Automation testing - Selenium");
		// Just Press Enter and confirm error message
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		WebElement error_msg = driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		System.out.println("Error messages displayed is : " + error_msg.getText());
		// Click and Confirm Label Position Changes
		WebElement label = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
		// System.out.println(label.getText());
		label.click();
		WebElement user = driver.findElement(By.xpath("//label[text()='Username']"));
		boolean confirm = user.getText().contains("Username");
		System.out.println("The text position is changed " + confirm);

		// Type your name and choose the third option
		WebElement label1 = driver.findElement(By.id("j_idt106:float-input"));
		label1.click();
	}
}

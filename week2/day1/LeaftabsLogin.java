package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftabsLogin {
	public static void main(String[] args) {
		// Setting up the Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the Browser
		driver.manage().window().maximize();
		// Pass the value to the element using id locator
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("demosalesmanager");
		// Pass the value to the element using id locator
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		// Pass the value to the element using className locator
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		// Pass the value to the element using linkText locator
		WebElement clicklink = driver.findElement(By.linkText("CRM/SFA"));
		clicklink.click();
		// Pass the value to the element using linkText locator
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		// Enter CompanyName Field Using id Locator
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TestLeaf");
		// Enter FirstName Field Using id Locator
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Marilakshmi");
		// Enter LastName Field Using id Locator
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Duraipandi");
		// Enter DepartmentName Field Using id Locator
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("Selenium");
		// Enter Description Field Using id Locator
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Learnings");
		// Enter Emailid Field Using id Locator
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("marilakshmi09@gmail.com");
		// Create Lead submit using className locator
		WebElement leadsubmit = driver.findElement(By.className("smallSubmit"));
		leadsubmit.click();
		// Click on Edit using linkText locator
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		// Clear the Description
		WebElement update_desc = driver.findElement(By.id("updateLeadForm_description"));
		update_desc.clear();
		// write the text in Important Notes
		WebElement imp_note = driver.findElement(By.id("updateLeadForm_importantNote"));
		imp_note.sendKeys("Training is Good");
		// Click update button
		WebElement update = driver.findElement(By.className("smallSubmit"));
		update.click();
		// Print Title name
		System.out.println(driver.getTitle());

		/*
		 * WebElement logout =driver.findElement(By.linkText("Logout")); logout.click();
		 * driver.close();
		 * 
		 */

	}
}

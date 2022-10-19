package week2.day2;

import org.openqa.selenium.By;
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
		driver.manage().window().maximize();
		// Pass the value to the element
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("demosalesmanager");

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("crmsfa");
		// Click Login
		WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		// Click crm/sfa link
		WebElement clicklink = driver.findElement(By.xpath("//a[@style='color: black;']"));
		clicklink.click();
		// Click Create Leads link
		WebElement createlead = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		createlead.click();
		// Enter company name
		WebElement companyName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyName.sendKeys("TestLeaf");
		// Enter first name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys("Marilakshmi");
		// Enter last name
		WebElement lastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys("Duraipandi");
		// select Source
		WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select sourceEmployee = new Select(source);
		sourceEmployee.selectByVisibleText("Employee");
		// select Industry
		WebElement industry = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select industryFinance = new Select(industry);
		industryFinance.selectByValue("IND_FINANCE");
		// select Ownership
		WebElement ownerShip = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select ownerShipCorporation = new Select(ownerShip);
		ownerShipCorporation.selectByIndex(5);
		// click create lead
		WebElement leadsubmit = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		leadsubmit.click();

		/*
		 * WebElement logout =driver.findElement(By.linkText("Logout")); logout.click();
		 * driver.close();
		 */

	}
}

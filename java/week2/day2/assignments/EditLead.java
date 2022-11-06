package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws Exception {
		// Setting up the Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the window
		driver.manage().window().maximize();
		// Enter the username
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("demosalesmanager");
		// Enter the password
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("crmsfa");
		// Click Login
		WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		// Click crm/sfa link
		WebElement clicklink = driver.findElement(By.xpath("//a[@style='color: black;']"));
		clicklink.click();
		// Click Leads link
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		// Click Find leads
		WebElement find_lead = driver.findElement(By.linkText("Find Leads"));
		find_lead.click();
		// Enter first name
		WebElement search_firstName = driver.findElement(By.xpath("//input[@id='ext-gen248']"));
		search_firstName.sendKeys("Lithika");
		// Click Find leads button
		WebElement search_click = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		search_click.click();
		// Click on first resulting lead
		WebElement first_result = driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=12985']"));
		first_result.click();
		// Verify title of the page
		System.out.println(driver.getTitle());
		// Click Edit
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		// Change the company name
		WebElement change_company = driver.findElement(By.id("updateLeadForm_companyName"));
		change_company.clear();
		change_company.sendKeys("Hindustan");
		// Click Update
		WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		// Confirm the changed name appears
		WebElement updated_company = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		System.out.println(updated_company.getText());
		// Close the browser (Do not log out)
		driver.close();

	}
}

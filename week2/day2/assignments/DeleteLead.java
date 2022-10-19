package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead  {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter the username
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("demosalesmanager");
		//Enter the password
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("crmsfa");
		//Click Login
		WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		// Click crm/sfa link
		WebElement clicklink = driver.findElement(By.xpath("//a[@style='color: black;']"));
		clicklink.click();
		// Click Leads link
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		//Click Find leads
		WebElement find_lead = driver.findElement(By.linkText("Find Leads"));
		find_lead.click();
		//Click on Phone
		WebElement phone = driver.findElement(By.xpath("//span[text()='Phone']"));
		phone.click();
		//Enter phone number
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='ext-gen270']"));
		phoneNumber.sendKeys("9876543");
		//Click find leads search button
		WebElement findLeads= driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads.click();
		Thread.sleep(2000);
		//Capture lead ID of First Resulting lead
		
		WebElement first_result= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String getLeadId = first_result.getText();
		System.out.println("Lead ID is :" +getLeadId);
		//Click First Resulting lead
		//WebElement firstResultClick= 
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//firstResultClick.click();
		//Click Delete
		WebElement delete = driver.findElement(By.xpath("//a[text()='Delete']"));
		delete.click();
		//Click Find leads
		WebElement find_lead1 = driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']"));
		find_lead1.click();
		//Enter captured lead ID
		WebElement leadId = driver.findElement(By.xpath("//input[@name='id']"));
		leadId.sendKeys(getLeadId);
		//Click find leads button
		WebElement findLeads1= driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads1.click();
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement display = driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println(display.getText());
		//Close the browser (Do not log out)
		driver.close();
		
	}
}

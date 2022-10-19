package week2.day2;

import java.time.Duration;

import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//to open the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Leads link
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//Click on Phone
		driver.findElement(By.linkText("Phone")).click();
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(2000);
		//Capture lead ID of First Resulting lead
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//Click Delete
		driver.findElement(By.xpath("//a[@href='javascript:document.deleteLeadForm.submit()']")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//Click on Phone
		driver.findElement(By.linkText("Name and ID")).click();
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		Thread.sleep(5000);
		String text1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text1);
	
		if(text1.contains("No records to display")){
		System.out.println("successful deletion");	
		//Close the browser (Do not log out)
		
	}
		//Close the browser (Do not log out)
		driver.close();
}
}
package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethods {
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String name, String pass, String cname, String fname, String lname) throws InterruptedException {
		//Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}
	
	@DataProvider (name="sendData")
	public String[][] sendData()
	{
		String[][] data = new String[2][5];
		
		data[0][0] = "DemoSalesManager";
		data[0][1] = "crmsfa";
		data[0][2] = "TestLeaf";
		data[0][3] = "Lithika";
		data[0][4] = "M";
		
		data[1][0] = "DemoSalesManager";
		data[1][1] = "crmsfa";
		data[1][2] = "TestLeaf";
		data[1][3] = "Karthikeyan";
		data[1][4] = "M";
		
		return data;
	}
}

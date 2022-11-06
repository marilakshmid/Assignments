package week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	public static void main(String[] args) {
		// Setting up the driver System.setProperty("webdriver.chrome.driver",
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mduraipandi\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup(); //Open the browser
		ChromeDriver driver = new ChromeDriver();
		// Launch the web Application
		driver.get("https://erail.in/");
		// Maximize the browser
		driver.manage().window().maximize();
		// implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter station name
		WebElement fromStation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStation.clear();
		fromStation.sendKeys("ms", Keys.TAB);
		// Enter To station name
		WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toStation.clear();
		toStation.sendKeys("mdu", Keys.TAB);
		// Uncheck Sort On date
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		// Get all train names
		List<WebElement> allTrains = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
		int trainNames = allTrains.size();
		System.out.println(trainNames);
		for (int i = 2; i <= trainNames; i++) {
			String train = driver.findElement(
					By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" + i
							+ "]//td[2]"))
					.getText();
			System.out.println(train);
		}

		// Using Set
		HashSet<WebElement> c = new HashSet<WebElement>();
		HashSet<WebElement> s = new HashSet<WebElement>();
		for (WebElement duplicates : allTrains) {
			if (!c.add(duplicates)) {
				s.add(duplicates);
			}
		}
		int duplic = s.size();
		if (duplic == 0)
			System.out.println("There are no duplicates");
		else
			System.out.println("Duplicate numbers in Set are " + s);
	}
}

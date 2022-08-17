import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"))
				.getText().contains("December")) {

			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count;i++) {
			
			String text = driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
			
			if(text.contains("30")) {
				driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
				break;
			}
		}

	}

}

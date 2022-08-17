import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExOne {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> noOfRow = driver.findElements(By.xpath("//table[@class='table-display']//tr"));
		System.out.println(noOfRow.size());

		List <WebElement> noOfColums = driver.findElements(By.xpath("//table[@class='table-display']//tr/th"));
		System.out.println(noOfColums.size());
		
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']//tr[3]")).getText());
	}

}

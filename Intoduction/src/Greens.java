
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greens {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		int j=0;
		String[] itemsName = {"Brocolli","Cucumber","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(4000);
		List <WebElement> products = driver.findElements(By.className("product-name"));
		
		for (int i=0; i<products.size();i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			System.out.println(formattedName);
			List itemsList = Arrays.asList(itemsName);
			if(products.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsName.length) {
					break;
				}
			}
		}
		

	}

}

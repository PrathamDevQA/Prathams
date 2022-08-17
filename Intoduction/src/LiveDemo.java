import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org. testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LiveDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Stream video
		
		
		
		driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elementList =  driver.findElements(By.xpath("//tr//td[1]"));
		
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		originalList.stream().forEach(s->System.out.println(s));
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		sortedList.stream().forEach(s->System.out.println(s));
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		
		
	}
	
}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
	public WebDriver driver;
	By email = By.id("user_email");
	By sendMeInstructions = By.xpath("//input[@name='commit']");
	
	public ForgotPasswordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}

	public WebElement getUserEmail() {
		return driver.findElement(email);
	}
	
	public WebElement sendMeInstruction() {
		return driver.findElement(sendMeInstructions);
	}

}

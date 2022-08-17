package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LoginPage extends Base{
	
	By email = By.id("user_email");
	
	By password= By.id("user_password");
	
	By logIn=By.name("commit");
	
	By forgotPassword = By.xpath("//a[@class='link-below-button']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(logIn);
	}
	
	public ForgotPasswordPage forgotPassword() {
		driver.findElement(forgotPassword).click();
		return new ForgotPasswordPage(driver);
		
	}
	
	


}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LandingPage extends Base {

	By signIn = By.cssSelector("a[href*='sign_in']");
	
	By title = By.cssSelector(".text-center>h2");
	
	By navigationsBar = By.cssSelector("#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public LoginPage getLogIn() {
		driver.findElement(signIn).click();
		return new LoginPage(driver);
		
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getNavBar() {
		return driver.findElement(navigationsBar);
	}
}

package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.Action;
import base.ReptimeBase;

public class LoginPage extends ReptimeBase{

	Action action = new Action();

	@FindBy(id="username") 
	WebElement Username; 
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//img[@class='logo logo-img']")
	WebElement loGo;
	
	@FindBy(xpath= "//a[text()='Create an Account']")
	WebElement createAnAccountButton;
	
	@FindBy(xpath = "//a[text()='Forgot your username?']")
	WebElement forgotUsrnameButton;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement forgotPasswordButton;
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}


	public boolean validateLogo() {
		action.isDisplayed(driver, loGo);
		return true;
	}
	
	public DashBoard login(String username, String password) {
		
		action.type(Username, username);
		action.type(Password, password);
		action.click(driver,loginButton);
		return new DashBoard();
	}
	
	public RegistratioPage registerAccount() {
		action.click(driver,createAnAccountButton);
		return new RegistratioPage();
	}
	
	public ForgotUsernamePage fUsername() {
		action.click(driver,forgotUsrnameButton);
		return new ForgotUsernamePage();
	}

	public ForgotPasswordPage fPassword() {
		action.click(driver,forgotPasswordButton);
		return new ForgotPasswordPage();
	}
}

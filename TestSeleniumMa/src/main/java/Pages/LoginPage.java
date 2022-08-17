package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.Action;
import BaseClass.ReptimeBase;

public class LoginPage extends ReptimeBase{
	Action action = new Action();

	@FindBy(id="username") 
	WebElement userName; 
	
	@FindBy(id="password")
	WebElement passWord;
	
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
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
	}

	public boolean validateLogo() {
		action.isDisplayed(driver, loGo);
		return true;
	}
	
	public DeshBoard login(String username, String password) {
		
		action.type(userName, username);
		action.type(passWord, password);
		action.click(driver,loginButton);
		return new DeshBoard();
	}
	
	public RegistraionsPage registerAccount() {
		action.click(driver,createAnAccountButton);
		return new RegistraionsPage();
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

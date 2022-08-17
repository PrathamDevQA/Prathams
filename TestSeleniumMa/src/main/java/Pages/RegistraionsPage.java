package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.Action;
import BaseClass.ReptimeBase;

public class RegistraionsPage extends ReptimeBase {

	Action action = new Action();
	
	@FindBy(xpath = "//p-radiobutton[@label='Salesperson']//div[2]")
	WebElement salespersonRadioButton;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement clickOnNextButton;

	@FindBy(xpath= "//input[@id='firstName']")
	WebElement enterFirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement enterLastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement enterEmail;
	
	@FindBy(xpath="//input[@id='confirmEmail']")
	WebElement enterConfirmEmail;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement enterUsername;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement enterPassword;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	WebElement enterConfirmPassword;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnUserInfoPageNextButton;

	@FindBy(xpath="//h2[normalize-space()='Toy, Baby, and Kid']")
	WebElement selectBuissnessType;
	
	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement clickOnBuissbessTabNextButton;
	
	@FindBy(xpath="//input[@id='re-name']")
	WebElement enterCompanyName;
	
	@FindBy(xpath="//input[@id='re-address1']")
	WebElement enterAddress1;
	
	@FindBy(xpath="//input[@id='re-address2']")
	WebElement enterAddress2;
	
	@FindBy(xpath="//input[@id='re-zip']")
	WebElement enterZipCode;
	
	@FindBy(xpath="//input[@autocomplete='work tel']")
	WebElement enterPhoneNo;
	
	@FindBy(xpath="//p-inputmask[@id='re-fax']//input[@type='text']")
	WebElement enterFax;
	
	@FindBy(xpath="//p-inputmask[@id='re-fax']//input[@type='text']")
	WebElement enterComapnyEmail;
	
	@FindBy(xpath="//p-checkbox[@id='terms']//div[2]")
	WebElement selectCheckBox;
	
	@FindBy(xpath = "//button[@type='submit']//span[2]")
	WebElement clickOnSubmitButton;
	

	
	@FindBy(xpath = "//span[contains(text(),'Go Back to')]")
	WebElement clickOnBackToLoginBbutton;

	public RegistraionsPage() {
		PageFactory.initElements(driver, this);
	}

	public UserInfoPage selectSpRadiobutton() {
		action.click(driver, salespersonRadioButton);
		action.click(driver, clickOnNextButton);
		
		action.type(enterFirstName, "NilayS");
		action.type(enterLastName, "GamitS");
		action.type(enterEmail, "pratham+31@markettime.com");
		action.type(enterConfirmEmail,"pratham+31@markettime.com");
		action.type(enterUsername,"NilaySG");
		action.type(enterPassword, "Reptime1!");
		action.type(enterConfirmPassword, "Reptime1!");
		action.click(driver, clickOnUserInfoPageNextButton);
		
		
		
		return new UserInfoPage();
	}

	public LoginPage backToLogin() {
		action.click(driver, clickOnBackToLoginBbutton);
		return new LoginPage();
	}
}

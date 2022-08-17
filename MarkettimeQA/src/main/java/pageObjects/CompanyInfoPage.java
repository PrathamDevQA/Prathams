package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.Action;
import base.ReptimeBase;

public class CompanyInfoPage extends ReptimeBase{

	Action action = new Action();

	@FindBy (xpath="//input[@id='re-name']")
	WebElement companyname;
	
	@FindBy (xpath="//input[@id='re-address1']")
	WebElement address1;

	@FindBy (xpath="//input[@id='re-address2']")
	WebElement address2;

	@FindBy (xpath="//input[@id='re-zip']")
	WebElement zipcode;

	@FindBy (xpath="//input[@autocomplete='work tel']")
	WebElement phonenumber;

	@FindBy (xpath="//p-inputmask[@id='re-fax']//input[@type='text']")
	WebElement faxnumber;
	
	@FindBy (xpath="//input[@type='email']")
	WebElement companyemail;

	@FindBy (xpath="//p-inputmask[@formcontrolname='fax']//input[@type='text']")
	WebElement agree;

	@FindBy (xpath="//body//app-root//div[contains(text(),'I agree to the')]//div//div[1]")
	WebElement submit;


	public CompanyInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SuccessPage CompanyInfo() {
		
		action.type(companyname, "Heros");
		action.type(address1, "Dallsa");
		action.type(address2, "LS");
		action.type(zipcode, "90001");
		action.type(phonenumber, "9999900000");
		action.type(faxnumber, "7777788888");
		action.type(companyemail, "pratham+996@marekttime.com");
		action.click(driver, agree);
		action.click(driver, submit);
		return new SuccessPage();
	}

}

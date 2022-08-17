package TestPages;

import org.testng.annotations.Test;

import BaseClass.ReptimeBase;
import Pages.RegistraionsPage;
import Pages.UserInfoPage;

public class RegistrationPageTest extends ReptimeBase {
	
	public RegistraionsPage selectSeller;
	public UserInfoPage userinfo;
	
	@Test
	public void SelectSellerOption() {
		
		selectSeller = loginpage.registerAccount();
		userinfo = selectSeller.selectSpRadiobutton();
		
		
		
	}

}

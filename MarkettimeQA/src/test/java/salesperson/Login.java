package salesperson;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ReptimeBase;
import pageObjects.DashBoard;
import pageObjects.ForgotPasswordPage;
import pageObjects.ForgotUsernamePage;
import pageObjects.RegistratioPage;

public class Login extends ReptimeBase {

	DashBoard dashBoard;
	RegistratioPage registration;
	ForgotUsernamePage forgotusrname;
	ForgotPasswordPage forgotPassword;
	
	@Test(priority=1)
	public void verifyLogoTest() {
		

		boolean flag = loginpage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void verifyLogin() {
		
		dashBoard = loginpage.login(props.getProperty("username"),props.getProperty("password"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://reptimeqa.com/dashboard";
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Test(priority=4)
	public void verifyCreateAccount() {
		
		registration = loginpage.registerAccount();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://reptimeqa.com/register";
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Test(priority=2)
	public void forgotUsername() {
		forgotusrname = loginpage.fUsername();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actulURL = driver.getCurrentUrl();
		String expectedURL = "https://reptimeqa.com/forgot-username";
		
		Assert.assertEquals(actulURL, expectedURL);
	}
	
	
	@Test(priority=3)
	public void forgotPassword() {
		forgotPassword = loginpage.fPassword();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://reptimeqa.com/forgot-password";
		
		Assert.assertEquals(actualURL, expectedURL);
	}

}

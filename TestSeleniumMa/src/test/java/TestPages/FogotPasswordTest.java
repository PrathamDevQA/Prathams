package TestPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.ReptimeBase;
import Pages.ForgotPasswordPage;
import Pages.ResetPassWordPage;

public class FogotPasswordTest extends ReptimeBase{
	
	public ForgotPasswordPage forgotpassword;
	public ResetPassWordPage resetpassword;
	
	@Test()
	public void resetPassWord() throws InterruptedException {
		forgotpassword = loginpage.fPassword();
		resetpassword = forgotpassword.enterUsername(props.getProperty("username"));
		Thread.sleep(5000);
		String actualTitle = driver.findElement(By.xpath("//span[text()='Confirm New Password']")).getText();
		String expetedTitle= "Confirm New Password";
		Assert.assertEquals(actualTitle, expetedTitle);
	}
	
	@Test
	public void backToLogin() throws InterruptedException {
		
		forgotpassword = loginpage.fPassword();
		Thread.sleep(5000);

		loginpage = forgotpassword.backToLogin();
		Thread.sleep(7000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = props.getProperty("URL");
		Assert.assertEquals(actualURL, expectedURL);
	}

}

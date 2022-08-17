package salesperson;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ReptimeBase;
import pageObjects.RegistratioPage;
import pageObjects.UserInfoPage;

public class CompanyInfo extends ReptimeBase {
	
	public RegistratioPage selectSeller;
	public UserInfoPage userinfo;
	
	
	@Test
	public void Suc() throws IOException, InterruptedException {
		
		selectSeller = loginpage.registerAccount();
		userinfo = selectSeller.CreateNewAccount();
		String actual = driver.findElement(By.xpath("//span[normalize-space()='Thank you for registering with MarketTime!']")).getText();
		String expected = "Thank you for registering with MarketTime!";
		Assert.assertEquals(actual, expected);
	}

}

package e2eProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ForgotPasswordPage;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class Homepage extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initalizeDriver();
		log.info("Driver is initialize");
		
	}
	
	@Test (dataProvider="getData")
	public void basePageNaviagation(String username, String password) throws IOException {
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the Home Page");
		LandingPage l = new LandingPage(driver);
		LoginPage lp = l.getLogIn();
		log.info("click on the Login button");
		lp.getEmail().sendKeys(username);
		log.info("Suceesfully enter Username"+username);
		lp.getPassword().sendKeys(password);
		log.info("sucessfully enter Passwrod"+password);
//		System.out.println(text);
		lp.getLogin().click();
		log.info("sucessfully click on the SignIn Button");
		
		ForgotPasswordPage fp = lp.forgotPassword();
		fp.getUserEmail().sendKeys("xcvb");
		fp.sendMeInstruction().click();
	}
	
	@DataProvider
	public Object[][] getData() {
		//Row stand for the different data types test should run
		//Columns stand for how many value per each test
		Object[][] data = new Object[2][2];
		data[0][0] = "nonrestricteduser@qw.com";
		data[0][1] = "123456";
//		data[0][2] = "Restricted User";
		
		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "456788";
//		data[1][2] = "Non Restricted User";
		
		return data;
		
	} 
	
	@AfterTest
	public void tearDown() {
		driver.close();
		log.info("Browser is succesfully close");
	}

}

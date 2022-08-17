package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class ReptimeBase {

	public String browser;
	public static WebDriver driver;
	public static Properties props;
	public LoginPage loginpage;

	@BeforeClass
	public void setUP() {

		loadConfig();
		browser = props.getProperty("browser");

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		loginpage = new LoginPage();

	}

	@BeforeMethod
	public void openURL() {
		driver.get(props.getProperty("URL"));
	}

	@AfterClass
	public void tearsDown() {
		driver.close();
	}

	public void loadConfig() {

		try {
			props = new Properties();

			FileInputStream inputFile = new FileInputStream(
					"C:\\MarketTimeQa\\MarkettimeQA\\Configrations\\config.properties");

			props.load(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}

package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	
		public WebDriver driver;
		@BeforeMethod
		public void preCondition()
		{
			String key="webdriver.gecko.driver";
			String value="E://gained from IBM//Selenium jar files//geckodriver.exe";
			System.setProperty(key,value);
		driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@AfterMethod
		public void postCondition()
		{
		driver.close();
		}
		}




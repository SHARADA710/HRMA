package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrack 
{
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(xpath="(//div[@class='popup_menu_button popup_menu_button_support'])[3]")
	private WebElement help;
	@FindBy(linkText="About actiTIME")
	private WebElement aboutActiTIME;
	@FindBy(xpath="//span[contains(text(),'build')]")
	private WebElement buildNumber;
	@FindBy(xpath="//im[@title='Close']")
	private WebElement close;
	public EnterTimeTrack(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void clickLogoutLink()
	{
	logoutLink.click();
	}
	public void clickHelp()
	{
		help.click();
	}
	public void clickAboutActiTime()
	{
	aboutActiTIME.click();
	}
	public void verifyBuildNumber(String eBuildNumber)
	{
	String aBuildNumber=buildNumber.getText();
	Assert.assertEquals(aBuildNumber, eBuildNumber);
	}
	public void clickClose()
	{
	close.click();
	}
}

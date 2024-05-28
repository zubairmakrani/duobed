package pageLayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testBaseLayer.TestBase;

public class AccountPage extends TestBase {

	//OR

	@FindBy(xpath="//img[@class='js lazyautosizes lazyloaded']")
	private WebElement  logo;

	//Initialization

	public AccountPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	//usage/actions

	public void verifyTitle() {
		String title=driver.getTitle().trim();
		Assert.assertEquals(title, "Account – DuoBed Store");

	}

	public LandingPage clickOnLogo() throws InterruptedException {

		Thread.sleep(2000);
		boolean flag=logo.isDisplayed();
		Assert.assertTrue(flag);
		logo.click();
		Thread.sleep(2000);
		String landingPageTitle=driver.getTitle().trim();
		Assert.assertEquals(landingPageTitle, "Retail Storage Ottoman furniture Stores In USA - – DuoBed Store");
		return new LandingPage(driver);

	}

}

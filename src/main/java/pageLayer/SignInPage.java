package pageLayer;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBaseLayer.TestBase;

public class SignInPage extends TestBase {
	
	@FindBy(xpath="//input[@id='customer_email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@id='customer_password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@value='Sign In']")
	private WebElement signInBtn;
	
	public SignInPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void verifyEmailField(String email) {
		boolean flag=emailField.isEnabled();
		Assert.assertTrue(flag);
		emailField.clear();
		emailField.sendKeys(email);
		
	}
	
	public void verifyPasswordField(String password) {
		boolean flag=passwordField.isEnabled();
		Assert.assertTrue(flag);
		passwordField.clear();
		passwordField.sendKeys(password);
		
	}
	
	public AccountPage verifySignInBtn() {
		boolean flag=signInBtn.isDisplayed();
		Assert.assertTrue(flag);
		//signInBtn.click();
		signInBtn.sendKeys(Keys.ENTER);
		String titleAccountPage=driver.getTitle();
		Assert.assertEquals(titleAccountPage, "Account – DuoBed Store");
		return new AccountPage(driver);
		
		
	}
	

}

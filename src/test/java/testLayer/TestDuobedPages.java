package testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import pageLayer.AccountPage;
import pageLayer.LandingPage;
import pageLayer.SignInPage;
import testBaseLayer.TestBase;

public class TestDuobedPages extends TestBase {
	
	
	@Test(priority=1)
	public void testSignInPage() {
		
		signIn=new SignInPage(driver);
		signIn.verifyEmailField(prop.getProperty("email"));
		signIn.verifyPasswordField(prop.getProperty("password"));
		signIn.verifySignInBtn();
	}
	
	@Test(priority=2)
	public void testAccountPage() throws InterruptedException {
		accountPage=new AccountPage(driver);
		accountPage.verifyTitle();
		accountPage.clickOnLogo();
	}
	
	@Test(priority=3)
	public void testLandingPage() throws IOException {
		landingPage=new LandingPage(driver);
		landingPage.verifyFooter();
	}
	
	

}

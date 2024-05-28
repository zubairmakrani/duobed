package pageLayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBaseLayer.TestBase;
import utility.commonUtilities;

public class LandingPage extends TestBase {
	
	@FindBy(xpath="//div[@class='grid-item small--one-whole two-twelfths']/..//a")
	private List<WebElement> footerLinks;

	public LandingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyFooter() throws IOException {
		commonUtilities.scrollBar(0, 1500);
		commonUtilities.verifyBrokenLinks(footerLinks);
		commonUtilities.scrollBar(0, -1500);
	}
	
	
}

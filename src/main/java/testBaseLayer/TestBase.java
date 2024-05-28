package testBaseLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pageLayer.AccountPage;
import pageLayer.LandingPage;
import pageLayer.SignInPage;
import utility.commonUtilities;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
	public static WebDriver driver;
	public static ChromeOptions opt;
	public static SignInPage signIn;
	public static AccountPage accountPage;
	public static Properties prop;
	public static commonUtilities util;
	public static LandingPage landingPage;
	public static Logger log;
	
	@BeforeSuite
	public void startMethod() {
		
		log=Logger.getLogger("My logger");
		PropertyConfigurator.configure("Log4j.properties");
		log.info("Framework execution started");
	}
	
	@AfterSuite
	public void endMethod() {
		log.info("End of Frameword");
	}
	
	@BeforeClass
	public void setUp() throws IOException {
		
		util=new commonUtilities();
		util.readConfigFile();
		
		opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(opt);
		
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void tearDown() {
		
		//driver.quit();
		
	}
	
	
	/*
	 * @BeforeMethod public void logIn() {
	 * 
	 * 
	 * }
	 * 
	 * @AfterMethod public void logOut() {
	 * 
	 * }
	 */
	 

}

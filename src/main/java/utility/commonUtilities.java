package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import testBaseLayer.TestBase;

public class commonUtilities extends TestBase {
	
	public void readConfigFile() throws IOException {
		
		prop=new Properties();
		String path=System.getProperty("user.dir")+".//config.properties";
		FileInputStream file=new FileInputStream(path);
		prop.load(file);
		
	}
	
	public static void takeScreenshot(String fileName) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+".//screenshots//"+fileName+"failed.jpg";
		File dest=new File(path);
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void verifyBrokenLinks(List<WebElement> anchors) throws IOException {
		
		for(WebElement anchor:anchors){
			String link=anchor.getAttribute("href");
			String hyperLink=anchor.getText();
			URL url=new URL(link);
			
			HttpURLConnection httpConn=(HttpURLConnection)url.openConnection();
			httpConn.connect();
			
			int resCode=httpConn.getResponseCode();
			if(resCode>=400) {
				System.out.println(hyperLink+": is Broken with a response code: "+resCode+" and link is: "+link);
			}
			else {
				System.out.println(hyperLink+": is Valid with a response code: "+resCode+" and link is: "+link);
			}
		}
		
		
		
	}
	
	public static void scrollBar(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy("+x+","+y+")");
	}

}

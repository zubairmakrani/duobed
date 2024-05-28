package basicPractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		List<String> values=Arrays.asList("Zubair","Ravi","Ram");
		
		for(String value:values) {
			WebElement searchField=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
			
			searchField.clear();
			searchField.sendKeys(value);
			searchField.sendKeys(Keys.ENTER);
			String title=driver.getTitle();
			System.out.println(title);
		}
		
		
	}

}

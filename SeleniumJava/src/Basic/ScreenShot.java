package Basic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import graphql.Assert;

public class ScreenShot {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com");
		String str=driver.getTitle();
		System.out.println(str);
		
		//1.  take screenshot and convert it into file format
		//get sceen shot is methot return type is file  and convert driver to take screeen shot interface
		
		
		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		try 
		{
			//2. now copy file to desired location	
			Files.copy(screenshotfile, new File("E:\\eclipse\\SeleniumJava\\screen\\screen.png"));
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
	
	
	
	}
}

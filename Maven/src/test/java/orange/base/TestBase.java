package orange.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("E:\\eclipse\\Maven\\src\\test\\java\\orange\\property\\config.properties");
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String broname =prop.getProperty("browser");
		
		if(broname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			//driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(prop.getProperty("url"));
			
		}
		
		
	
		
		
		
	}
}

package Basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpAlert {

	static WebDriver driver;
	public static void alertSimple() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://mypage.rediff.com/login/dologin");
		
		WebElement drag=driver.findElement(By.xpath("//body[1]/div[3]/div[5]/div[1]/form[1]/div[2]/input[3]"));
		drag.click();
		
		Alert alrt=driver.switchTo().alert();
		
		String text=alrt.getText();
		System.out.println(text);
		
		if(text.equals(("Please enter a valid email"))){
			System.out.println("Username is correct");
		}else {
			System.out.println("Please enter correct username");
		}

		Thread.sleep(5000);
		alrt.accept();
		alrt.dismiss();
		driver.quit();
	}
	
	public static void alertbasicAuth() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		//syntax
		//https:user:pass@URL
		
	}
	

	public static void permissionPopUp() {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		
	}
	
public static void main(String[] args) {
	
	//alertSimple();
	//alertbasicAuth();
	permissionPopUp();
}
}

package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovement {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.half.ebay.com");
		
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		
		Actions action=new Actions(driver);  //class
		
		action.moveToElement(electronics).build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(electronics));
		
		driver.findElement(By.linkText("Apple")).click();
		
		WebElement el3= driver.findElement(By.xpath("//body/div[5]/div[4]/div[3]/section[1]/div[2]/a[1]/div[1]/img[1]"));
		action.contextClick(el3).build().perform();
	
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}

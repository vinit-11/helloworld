package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		

		Actions action=new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		driver.quit();
	}
}

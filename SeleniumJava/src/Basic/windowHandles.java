package Basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Start my free trial')]"));
	
		ele.click();
		
		
		
		Set<String> handler=driver.getWindowHandles();
		System.out.println(handler);
		Iterator<String> it=handler.iterator();
		
		String parentWindow=it.next();
		System.out.println("Parent window id : "+parentWindow);
		
		
		String childWindow=it.next();
		System.out.println("Child window id : "+childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println("child window  title : "+driver.getTitle());
		
		Thread.sleep(2000);
		
		WebElement el1=driver.findElement(By.xpath("//input[@name='UserFirstName']"));
		
		el1.sendKeys("Barak");
		
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Obama");
		//driver.close();
		
		
		
		driver.switchTo().window(parentWindow);
		System.out.println("parent window title : "+driver.getTitle());
		//driver.close();

}
}
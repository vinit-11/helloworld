package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxess {
	public static WebDriver driver;
	public static void allChk() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		//select single
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List<WebElement> chk=driver.findElements(By.xpath("//input[@class='form-check-input' and  @type='checkbox']"));
		
		//System.out.println(chk.size());
		
		for(WebElement box:chk) 
		{
			box.click();
		}
	}
		public static void twoFromAlll() {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			
			List<WebElement> chk=driver.findElements(By.xpath("//input[@class='form-check-input' and  @type='checkbox']"));
			
			//System.out.println(chk.size());
			
			for(WebElement box:chk) 
			{
				String chkName=box.getAttribute("id");
				
				if(chkName.equalsIgnoreCase("monday") && chkName.equalsIgnoreCase("sunday")) 
				{
					
					box.click();
				}
			}

		}
			
			
			public static void lastTwoChk() {
				
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
			
				driver.get("https://itera-qa.azurewebsites.net/home/automation");
				
				
		
				
				List<WebElement> chk=driver.findElements(By.xpath("//input[@class='form-check-input' and  @type='checkbox']"));
				
				//System.out.println(chk.size());
				int a=chk.size()-2;
				for(int i=a; i<chk.size(); i++) 
				
				//for(int i=0; i<chk.size()-5; i++) 
				{
					chk.get(i).click();
				}
		
	}
	
	public static void main(String[] args) {
		//CheckBoxess.allChk();
		//CheckBoxess.twoFromAlll();
		CheckBoxess.lastTwoChk();
	}

}

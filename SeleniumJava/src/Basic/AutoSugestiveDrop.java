package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestiveDrop {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		String fromFF="Delhi";
		String fromSF="Del";
		
		String toFF="Jaipur";
		String toSF="Jaip";
		
		WebElement from=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		from.click();
		from.sendKeys(fromSF);
		
		List <WebElement> dropdwn=driver.findElements(By.xpath("//tbody/tr/td/div/div/div/ul/li/a"));
		
		for(WebElement selection:dropdwn)
		{
			String ele=selection.getText();
			System.out.println(ele);
			if(selection.getText().equalsIgnoreCase(fromFF))
			{
				selection.click();
			}
		}	
			WebElement To=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
			To.click();
			To.sendKeys(toSF);
			List <WebElement> dropdwn1=driver.findElements(By.xpath("//tbody/tr/td/div/div/div/ul/li/a"));
			
			for(WebElement selectionTo:dropdwn1)
			{
				if(selectionTo.getText().equalsIgnoreCase(toFF))
				{
					selectionTo.click();
				}
		
				

			}}	}

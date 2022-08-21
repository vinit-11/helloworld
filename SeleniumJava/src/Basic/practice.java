package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	//To launch chrome driver
	WebDriver driver=new ChromeDriver();

	//To enter URL
	driver.get("https://www.confirmtkt.com/rbooking-d/");


	driver.manage().window().maximize();		//To maximize window
	driver.manage().deleteAllCookies();		//To delete all coockie
	//driver.manage().window().minimize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//To click on date picker on main page
	driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[4]/div[1]/label[1]")).click();

	String monthYr="June 2022";

	String day ="20";
	
	while(true) {
	
		String text=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();

		System.out.println(text);

		
		if(monthYr.equals(text)) 
		{
			break;
		}else
		{
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
		}
	}
		List<WebElement> ele=driver.findElements(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div/div/button/span/p"));
		for(int i=0; i<ele.size(); i++) 
		{
		String date=ele.get(i).getText();
		
		if(day.equals(date))
		{
			ele.get(i).click();
			break;
			}
		}
	//driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td[contains(text(),"+day+")]")).click();
		
//		driver.findElement(By.xpath("//button")).click();
//		boolean b=driver.findElement(By.xpath("//input[@name='Quota' and  @value='GN']\"")).isSelected();
//		//boolean b2=driver.findElement(By.xpath("//input[@name='Quota' and  @value='GN']\"")).isEnabled();
//		System.out.println(b);
//		//System.out.println(b2);
//
//		/*boolean b1=driver.findElement(By.xpath("//input[@name='Quota' and  @value='LD']")).isSelected();
//		boolean b13=driver.findElement(By.xpath("//input[@name='Quota' and  @value='LD']")).isEnabled();
//		System.out.println(b1);
//		System.out.println(b13);*/



}
	
	
}


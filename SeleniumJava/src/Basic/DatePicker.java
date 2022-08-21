package Basic;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

		//To set property
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		//To launch chrome driver
		WebDriver driver=new ChromeDriver();

		//To enter URL
		driver.get("https://www.redbus.in/");


		driver.manage().window().maximize();		//To maximize window
		driver.manage().deleteAllCookies();		//To delete all coockie

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//To click on date picker on main page
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span")).click();

		String monthYr="Nov 2022";

		String day ="25";

		while(true)
		{
			//To click on month and year (Jun 2022)
			String text=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();

			System.out.println(text);

			//To compare text and pass text
			if(text.equals(monthYr)) 
			{
				break;

			}
			else
			{
				//To click on arrow
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			}
		}
		//To select the date on date picker
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td[contains(text(),"+day+")]")).click();

		/*
		 * List<WebElement> ele=driver.findElements(By.xpath("/html[1]/body[1]/div[4]/table[1]/tbody[1]/tr/td"));
		for(int i=0; i<ele.size(); i++) 
		{
		String date=ele.get(i).getText();
		
		if(day.equals(date))
		{
			ele.get(i).click();
			break;
			}
		}
		 */
		
		
		
		
		
		
		
		
		
		
		//driver.quit();
	}



}



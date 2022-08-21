package Basic;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set seytem property for chrome
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create instance for chrome driver
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Maximize windows 
		driver.manage().window().maximize();
		System.out.println("Parent browser opend");

		String url= "https://www.makemytrip.com/";
		String year= "2023";
		String month="March";
		String day= "3";

		// Launch application 
		driver.get(url);

		//Click on DatePicker

		WebElement Calender =driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]/p[1]"));
		Calender.click();

		//Next button
		WebElement next=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

		//Retrive Month And Year Text

		WebElement date=driver.findElement(By.className("DayPicker-Caption"));
		String currentYear=date.getText();
		System.out.println(currentYear);
		//System.out.println(year);

		String currentMonth=date.getText();
		System.out.println(currentMonth);
		//System.out.println(month);


		System.out.println(currentYear);

		//click on next button until we get desired year
		if(!currentYear.contains(year))
		{
			do 
			{
				next.click();
				
			}while(!date.getText().contains(year));

			//click on next button until we get desired month

			if(!currentMonth.contains(month)) 
			{
				do 
				{
					next.click();
					
				}while(!date.getText().contains(month));
			}

			//Select Day

			WebElement Day=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[6]/div[1]/p[1]"));
			Day.click();
		}


		//  driver.quit();





	}}
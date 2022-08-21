package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePickByDhanraj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		// DatePicker 1****

		driver.findElement(By.id("datepicker1")).click();
		String Date = "6-October-2012";
		String[] datearr = Date.split("-");
		String day = datearr[0];
		String month = datearr[1];
		String year = datearr[2];
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains(month+" "+year)) 
		{
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).getText());
		}
		List <WebElement> d=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for(int i=0;i<d.size();i++) {
			String s=	driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
//			System.out.println(s);
			if(s.equalsIgnoreCase(day)) {
				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
				break;
			}
		}
	}

}

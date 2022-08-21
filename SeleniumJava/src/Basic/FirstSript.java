package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSript {
public static void main(String[] args) {
	//to set path
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	//To launch chromedriver
	WebDriver driver=new ChromeDriver();

	//To open url
	driver.get("https://mypage.rediff.com/login/dologin");

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement clklink=driver.findElement(By.xpath("//*[@id=\"toprightinfo\"]/a[2]"));
	clklink.click();
	
	WebElement name=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	name.sendKeys("Vinit");
	
	WebElement mail=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	mail.sendKeys("Readdy");
	
	WebElement chkAvali=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	chkAvali.click();
	
	WebElement clkradi=driver.findElement(By.xpath("//*[@id=\"radio_login\"]"));
	clkradi.click();
	
	
	WebElement Pass=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input"));
	Pass.sendKeys("1234567890");
	
	WebElement rePass=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input"));
	rePass.sendKeys("1234567890");
	
	WebElement Altmail=driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
	Altmail.sendKeys("Rediyyee.mail");
	
	WebElement mono=driver.findElement(By.xpath("//*[@id=\"mobno\"]"));
	mono.sendKeys("56545454564");
	
	WebElement clkday=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	clkday.click();
	
	Select sel=new Select(clkday);
	sel.selectByValue("05");
	
	WebElement clkmonth=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	clkmonth.click();
	
	Select sel1=new Select(clkmonth);
	sel1.selectByValue("05");
	
	WebElement clkyr=driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(3)"));
	clkyr.click();
	
	Select sel2=new Select(clkyr);
	//sel2.selectByValue("2022");
	sel2.selectByVisibleText("2022");
	
	WebElement radiobtn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
	radiobtn.click();
	
	WebElement clkcountry=driver.findElement(By.id("country"));
	clkcountry.click();
	
	Select sel3=new Select(clkcountry);
	//sel3.selectByValue("12");
	sel3.selectByVisibleText("Austria");
	
	driver.quit();

}
}

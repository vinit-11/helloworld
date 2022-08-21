package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");


		// First frame

		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]")).click();
		driver.switchTo().defaultContent();


		// Second frame
		
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[contains(text(),'Alert')]")).click();
		driver.switchTo().defaultContent();

		// Third frame
		
		Thread.sleep(2000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")).click();
		driver.switchTo().defaultContent();
	}

}

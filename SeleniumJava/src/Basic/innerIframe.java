package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class innerIframe {

	public static void innerframe(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Frames.html");


		// Inner frame
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		
		driver.switchTo().frame(outerframe);  							 //here we switch to frame using webelement
		
		
		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		driver.switchTo().frame(innerframe); 
		
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("welcome");

	}
	
	public static void switchParentframe() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
		
		driver.switchTo().frame("iframeResult");        //switch to outer frame
		
		driver.switchTo().frame(0);       //switch to inner frame
		
		System.out.println("Text on inner frame : "+driver.findElement(By.xpath("//h1")).getText());
		
		driver.switchTo().parentFrame();
		
		String text= driver.findElement(By.xpath("//p[contains(text(),'An iframe is used to display a web page within a w')]")).getText();
		
		System.out.println("Text on parent frame is : "+text);
		
		
		
	}
	public static void main(String[] args) {
		//innerframe();
		switchParentframe();
	}

}

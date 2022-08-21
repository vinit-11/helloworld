package orange.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import orange.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory-OR
		@FindBy(id="txtUsername")
		WebElement uname;
		
		@FindBy(id="txtPassword")
		WebElement pass;
		
		@FindBy(id="btnLogin")
		WebElement loginbtn;
	
	
	//initializing the page object
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		
		return driver.getTitle();
		
	}
	
	public HomePage loginpageMethod(String un, String pw) {
		
		uname.click();
		
		uname.sendKeys(un);
		
		pass.sendKeys(pw);
	
		
		return new HomePage();
		
	}
	
	public void clikbtn() {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginbtn );
		//loginbtn.click();
	}

}

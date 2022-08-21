package orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import orange.base.TestBase;

public class HomePage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
 @FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
 WebElement Admin;
 
 @FindBy(xpath="//a[@id='menu_admin_Job']")
 WebElement job;
 
 @FindBy(xpath="//a[@id='menu_admin_viewJobTitleList']")
 WebElement jobTitle;
 
 @FindBy(xpath="//body/div[@id='wrapper']/div[@id='branding']/div[1]")
 WebElement img;
 
 public HomePage() {
	 
	PageFactory.initElements(driver, this);
 }
 
 public boolean verifyHomePage() {
	 
	return  img.isDisplayed();
	 
	
 }
 
 public void moveToAdmin() {
	 Actions action =new Actions(driver);
	 action.moveToElement(Admin).build().perform();
	
 }
 
 public void moveToJob() {
	 Actions action =new Actions(driver);
	 action.moveToElement(job).build().perform();
	 
	 jobTitle.click();
	
 }
 
 
}

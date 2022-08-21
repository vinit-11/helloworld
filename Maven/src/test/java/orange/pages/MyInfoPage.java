package orange.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import orange.base.TestBase;

public class MyInfoPage extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	MyInfoPage myinfopage;

	@FindBy(xpath="//input[@id='MP_link']")	
	WebElement marketplace;

	@FindBy(xpath="//a[@id='menu_pim_viewMyDetails']//b[text()='My Info']")
	WebElement myInfo;

	@FindBy(xpath="//input[@id='btnSave']")
	WebElement editBtn;

	@FindBy(xpath="//input[@id='personal_txtEmpFirstName']")
	WebElement fName;	

	@FindBy(xpath="//input[@id='personal_txtEmpLastName']")
	WebElement 	lName;

	@FindBy(xpath="//input[@id='personal_DOB']")
	WebElement 	dobBtn;

	@FindBy(xpath="//body//div//select[@class='ui-datepicker-month']")
	WebElement 	monthdobBtn;

	@FindBy(xpath="//body//div//select[@class='ui-datepicker-year']")
	WebElement 	yearhdobBtn;

	@FindBy(xpath="//tbody/tr/td/a[@class='ui-state-default']")
	List<WebElement> 	daydobBtn;

	@FindBy(xpath="//input[@id='btnSave']")
	WebElement 	saveBtn;

	public MyInfoPage() {

		PageFactory.initElements(driver, this);

	}
	public String verifyTitle() {

		return driver.getTitle() ;
	}

	public String verifyMyInfoPage() {

		return marketplace.getText();
	}


	public void clickMyInfo() {
		myInfo.click();
	}

	public void clicEditButton() {
		editBtn.click();

	}	


	public void firstNameFill() throws InterruptedException {
		Thread.sleep(2000);
		fName.click();
		fName.clear();
		fName.sendKeys("Barak");
	}


	public void lastNameFill() throws InterruptedException {
		Thread.sleep(2000);
		lName.click();
		lName.clear();
		lName.sendKeys("Obama");
	}


	public void clickDOBButton() {
		dobBtn.click();
	}



	public void dobMonthClick() {
		Select select = new Select(monthdobBtn);
		select.selectByValue("10");
	}


	public void dobYearClick() {
		Select select = new Select(yearhdobBtn);
		select.selectByVisibleText("1992");
	}


	public void dayDobClick() {

		for(WebElement i:daydobBtn) {

			String day=i.getText();
			System.out.println(day);
			if(day.equalsIgnoreCase("12"))
			{
				i.click();
			}
		}
	}

	public void clickSaveButton() {
		saveBtn.click();

	}





}

package stepDefinitaion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orange.base.TestBase;
import orange.pages.HomePage;
import orange.pages.LoginPage;
import orange.pages.MyInfoPage;

public class orangeStepDefination extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	MyInfoPage myinfopage;

	@Given("User is on login page")
	public void user_is_on_login_page() {

		TestBase.initialization();

		loginpage=new LoginPage();

		String title=loginpage.validateTitle();
		System.out.println("Title is : "+title);

	}

	@When("User enters Username and Password")
	public void user_enters_username_and_password() {

		loginpage.loginpageMethod(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("Click on login button")
	public void click_on_login_button() {
		loginpage.clikbtn();
	}

	// Home page


	@Given("user is on homepage")
	public void user_is_on_homepage() {

		homepage=new HomePage();
		boolean flag=homepage.verifyHomePage();
		System.out.println(flag);

	}


	@Then("user move on admin")
	public void user_move_on_admin() {
		homepage.moveToAdmin();
	}


	@Then("user move on job")
	public void user_move_on_job() {
		homepage.moveToJob();;
	}

	// My info page



	@Given("User is on home page")
	public void user_is_on_home_page() {

		myinfopage=new MyInfoPage();

		String Title=myinfopage.verifyTitle();
		System.out.println("Title is : " +Title);

	}

	@When("User click on my info")
	public void user_click_on_my_info() {
		myinfopage.clickMyInfo();
		String Text=myinfopage.verifyMyInfoPage();
		System.out.println(Text+ "This is text");


	}

	@Then("User click on edit button")
	public void user_click_on_edit_button() {
		myinfopage.clicEditButton();
	}

	@Then("User clear Fname")
	public void user_clear_fname() throws InterruptedException {

		myinfopage.firstNameFill();
	}

	@Then("User clear lname")
	public void user_clear_lname() throws InterruptedException {
		myinfopage.lastNameFill();
	}



	@Then("User click DOB calender")
	public void user_click_dob_calender() {
		myinfopage.clickDOBButton();
		
	}


	@Then("User click on MONTH")
	public void user_click_on_month() {
		myinfopage.dobMonthClick();
	}
	@Then("User click on YEAR")
	public void user_click_on_year() {
		myinfopage.dobYearClick();
	}
	@Then("User click on DAY")
	public void user_click_on_day() {
		myinfopage.dayDobClick();
	}









}
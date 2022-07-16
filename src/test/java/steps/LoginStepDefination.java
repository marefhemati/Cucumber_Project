package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase { // here we extend the TestBase class for rest of method of other
													// classes we make object, because we can not extend more then one
	// stepDefination are when we want to write features and change it to
	// StepDefinations and below is the method
//	Given User is on Techfios login page
	DatabasePage databasePage;
	
	LoginPage loginpageObj;

	@Before
	public void beforeRun() {
		initDriver();
		loginpageObj = PageFactory.initElements(driver, LoginPage.class); // here we create Loginpage object, then we
		databasePage = new DatabasePage();															// made it globle
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");

	}
//	When User enters username as "demo@techfios.com"
//	when we have a value insid "" we need to change "demo@techfios.com" to cucumeber expression is like below
//	""
//	\"\"
//	\"()\"
//	\"([])\"
//	\"([^\"]*)\"

	@When ("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginpageObj.enterUserName(username);	 
	}
	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String data) {
//		if(data.equalsIgnoreCase("username")) {
//			loginpageObj.enterUserName("demo@techfios.com");
//			
//		}else if(data.equalsIgnoreCase("password")){
//			loginpageObj.enterPassword("abc123");
//			
//		}else {
//			System.out.println("Invalid Data");
//		}
		// we can do both ways if or switch case above is if and below is switch
		switch (data) {
		case "username":
			System.out.println("Username from DB: "+ databasePage.getDataFromDb("username"));
			loginpageObj.enterUserName(databasePage.getDataFromDb("username"));
			break;
		case "password":
			System.out.println("Password from DB: "+ databasePage.getDataFromDb("password"));
			loginpageObj.enterPassword(databasePage.getDataFromDb("password"));

		default:
			System.out.println("Invalid Data");
		}

	}
	
	

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginpageObj.enterPassword(password);

	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() {
		loginpageObj.clickSignInButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginpageObj.getPageTitle());
	}

	@When("^User enters \"([^\"]*)\" from Techfios database$")
	public void user_enters_from_Techfios_database(String data) {

		switch (data) {
		case "username":
			loginpageObj.enterUserName("");
			break;
		case "password":
			loginpageObj.enterPassword("abc123");

		default:
			System.out.println("Invalid Data");
		}

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
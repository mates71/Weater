package weater.stepDefns;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChaseStepDefins {
	
	
	
	

@Given("^I am COL lofin page$")
public void i_am_COL_lofin_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I enter userName in userId field$")
public void i_enter_userName_in_userId_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I enter password in password field$")
public void i_enter_password_in_password_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click on login button$")
public void i_click_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I verify myAccond page is displayed$")
public void i_verify_myAccond_page_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

/*
	WebDriver driver = null;
	Class pageclass = null;

	//=================
	@SuppressWarnings("unchecked")
	@Given("^I am COL lofin page$")
	public void i_am_COL_lofin_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://chaseonlineq1.chase.com");
		pageclass = Class.forName("ChasePage");
		PageFactory.initElements(driver, pageclass);
	}

	@Given("^I enter \"([^\"]*)\" in \"([^\"]*)\" field$")
	public void i_enter_in_field(String value, String element) throws Throwable {
		Field field = pageclass.getDeclaredField(element);
		WebElement webelement = (WebElement) field.get(field);
		webelement.sendKeys(element);
	}

	@When("^I enter \"([^\"]*)\" in \"([^\"]*)\" field$")
	public void i_enter_in_field(int value, String element) throws Throwable {
		Field field = pageclass.getDeclaredField(element);
		WebElement webelement = (WebElement) field.get(field);
		webelement.sendKeys(element);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String element) throws Throwable {
	   
		Field field = pageclass.getDeclaredField(element);
		WebElement webelement = (WebElement) field.get(field);
		webelement.sendKeys(element);
	}

	@Then("^I verify \"([^\"]*)\" page is displayed$")
	public void i_verify_page_is_displayed(String arg1) throws Throwable {
	    
	}

*/
}

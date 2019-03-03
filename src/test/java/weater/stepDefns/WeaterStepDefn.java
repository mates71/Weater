package weater.stepDefns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import weater.pages.WeaterHPage;

public class WeaterStepDefn {
	
	public WebDriver driver;
	WeaterHPage hp;
	String url = "https://www.google.com/";

	@Given("^weater home page$")
	public void weater_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		
	
		hp=new WeaterHPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@When("^user search weater in specific city$")
	public void user_search_weater_in_specific_city() throws Throwable {
		Thread.sleep(2000);
		hp.search.sendKeys("weater in Charlotte,NC"+Keys.ENTER);
		System.out.println("Temprature is in Charlotte TODAY: "+hp.temprature.getText()+"F");
		hp.C_degree.click();
		System.out.println("Temprature is in Charlotte TODAY: "+hp.tempratureC.getText()+"C");
		hp.search.clear();
		
		
		Thread.sleep(2000);
		hp.search.sendKeys("weater in Fairfax,VA"+Keys.ENTER);
		System.out.println("Temprature is in Fairfax TODAY: "+hp.temprature.getText()+"F");
		Thread.sleep(2000);
		hp.C_degree.click();
		System.out.println("Temprature is in Fairfax TODAY: "+hp.tempratureC.getText()+"C");
		hp.search.clear();
		
		
		Thread.sleep(2000);
		hp.search.sendKeys("weater in Brookfield,WI"+Keys.ENTER);
		System.out.println("Temprature is in Brookfield TODAY: "+hp.temprature.getText()+"F");
		hp.C_degree.click();
		System.out.println("Temprature is in Brookfield TODAY: "+hp.tempratureC.getText()+"C");
		hp.search.clear();
		

		Thread.sleep(2000);
		hp.search.sendKeys("weater in Usak,Turkey"+Keys.ENTER);
		System.out.println("Temprature is in USAK TODAY: "+hp.temprature.getText()+"F");
		hp.C_degree.click();
		System.out.println("Temprature is in USAK TODAY: "+hp.tempratureC.getText()+"C");
		
	}

	@Then("^user able to get result$")
	public void user_able_to_get_result() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}

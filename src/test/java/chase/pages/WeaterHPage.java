package chase.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeaterHPage {

	WebDriver driver;

	public WeaterHPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@name='q']")
	public WebElement search;
	
	
	@FindBy(xpath = "//div[@class='vk_bk sol-tmp']/span[1]")
	public WebElement temprature;
	
	@FindBy(xpath = "//div[@class='locations-title five-day-page-title']")
	public WebElement verify_5_days;
	
	
	
	
	
	

}

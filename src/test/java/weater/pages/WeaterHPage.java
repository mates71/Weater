package weater.pages;

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
	
	
	@FindBy(id = "wob_tm")
	public WebElement temprature;
	
	@FindBy(id = "wob_ttm")
	public WebElement tempratureC;
	
	@FindBy(xpath = "//div[@class='locations-title five-day-page-title']")
	public WebElement verify_5_days;
	
	
	@FindBy(xpath = "//a[@class='wob_t'][2]")
	public WebElement C_degree;
	
	@FindBy(id = "gbqfbb")
	public WebElement googleLuckyBtn;
	
	
	
	
	
	//div[@class='vk_bk sol-tmp']/span[1]
	

}

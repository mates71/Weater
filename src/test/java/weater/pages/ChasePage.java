package weater.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class ChasePage {
	
	
	@FindBy(how=How.XPATH, using="//*[@id='userID']")
	public static WebElement userID;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='password']")
	public static WebElement PASSWORD;
	
	@FindBy(how=How.XPATH, using="//*[@id='logon']")
	public static WebElement LOGON;

}

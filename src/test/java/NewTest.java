import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class NewTest {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.glassdoor.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void LoginTest() throws InterruptedException{
		
		driver.findElement(By.linkText("Sign In")).click();
		WebElement email=driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("mates1780@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("#Tmsa2008");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement iconUser=driver.findElement(By.xpath(".//*[@id='TopNav']/nav/div[2]/ul[3]/li[2]/a"));
		Thread.sleep(3000);
	
		iconUser.click();
		
		/*Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(iconUser).perform();
		
		Thread.sleep(2000);
		WebElement resume=driver.findElement(By.xpath("//a[@data-hook='manage-resumes']"));
		action.moveToElement(resume, -78, 221).perform();
		
		WebElement exit=driver.findElement(By.xpath("//input[@value='Sign Out']"));
		action.moveToElement(resume, -78, 417).perform();*/
	}

}

package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Classes.SignINPage;

public class VerifySignINButton {
	WebDriver driver;
	SignINPage sign;
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		sign= new SignINPage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void TestA() throws InterruptedException
	{
		sign.ClickOnSignIN();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/?ref_=nav_signin&"))
		{
			System.out.println("Test is Pass");
		}
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}

}

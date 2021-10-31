package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	WebDriver driver;
	
	@FindBy (xpath="//a[@data-nav-role='signin']")
	private WebElement Account;
	
	@FindBy (xpath="//span[text()='Sign Out']")
	private WebElement signOut;
	
	
	public LogOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void ClickOnSignOut() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(Account).perform();
		Thread.sleep(3000);
		signOut.click();
	}

}

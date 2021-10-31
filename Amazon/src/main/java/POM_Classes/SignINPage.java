package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignINPage {
	WebDriver driver;
	
	@FindBy (xpath="//a[@data-nav-role='signin']")
	private WebElement Account;
	
	@FindBy (xpath="(//span[text()='Sign in'])[1]")
	private WebElement sign;
	
	@FindBy (xpath="//input[@name='email']")
	private WebElement MobileNumber;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement SignIN;
	
	public SignINPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnSignIN() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(Account).perform();
		Thread.sleep(3000);
		sign.click();
		Thread.sleep(3000);
		MobileNumber.sendKeys("8600315002");
		Thread.sleep(3000);
		Continue.click();
		Thread.sleep(3000);
		Password.sendKeys("8600315002");
		Thread.sleep(3000);
		SignIN.click();
	}

}

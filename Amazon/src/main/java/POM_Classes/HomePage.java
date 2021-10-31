package POM_Classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy (xpath="//a[text()='Fresh']")
	private WebElement Fresh;
	
	@FindBy (xpath="//a[text()='Amazon Pay']")
	private WebElement AmazonPay;
	
	@FindBy (xpath="//a[text()='Mobiles']")
	private WebElement Mobiles;
	
	@FindBy (xpath="//a[text()='Best Sellers']")
	private WebElement BestSellers;
	
	@FindBy (xpath="//a[@id='nav-link-prime']")
	private WebElement Prime;
	
	@FindBy (xpath="//a[text()='Buy Again']")
	private WebElement BuyAgain;
	
	@FindBy (xpath="(//a[text()='Customer Service'])[1]")
	private WebElement CustomerService;
	
	@FindBy (xpath="//a[text()=' Electronics ']")
	private WebElement Electronics;
	
	@FindBy (xpath="//a[text()='Gift Cards']")
	private WebElement GiftCards;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void ClickOnFresh()
	{
		Fresh.click();
	}
	

	public void ClickOnAmazonPay()
	{
		AmazonPay.click();
	}
	
	public void ClickOnMobiles()
	{
		Mobiles.click();
	}
	
	
	public void ClickOnBestSellers()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",BestSellers);
	}
	

	public void ClickOnPrime()
	{
		Prime.click();
	}
	
	
	public void ClickOnBuyAgain()
	{
		BuyAgain.click();
	}
	
	public void ClickOnCustomerService()
	{
		CustomerService.click();
	}
	
	public void ClickOnElectronics()
	{
		Electronics.click();
	}
	
	public void ClickOnGiftCards()
	{
		GiftCards.click();
	}

}

package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.Base;
import POM_Classes.HomePage;
import POM_Classes.LogOutPage;
import POM_Classes.SignINPage;




public class VerfiyHomePageFunctionality extends Base {
	WebDriver driver;
	SignINPage sign;
	HomePage homepage;
	LogOutPage logout;
	
	
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String browser)
	{

		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = openChromeBrowser();
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver =openfirefoxBrowser();
		}
	    
	
	}
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		sign= new SignINPage(driver);
		homepage = new HomePage(driver);
		logout = new LogOutPage (driver);
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		sign.ClickOnSignIN();
	}
	
	@Test
	public void VerifyFreshButton() throws InterruptedException
	{
		homepage.ClickOnFresh();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/alm/storefront?almBrandId=ctnow&ref_=nav_cs_fresh_2d5a9b04685f4087af601ec2c93f1f47");
	}
	
	@Test
	public void VerifyAmazonPayButton() throws InterruptedException
	{
		homepage.ClickOnAmazonPay();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f");
	}
	
	@Test
	public void VerifyMobilesButton() throws InterruptedException
	{
		homepage.ClickOnMobiles();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7");
	}
	
	@Test
	public void VerifyBestSellersButton() throws InterruptedException
	{
		homepage.ClickOnBestSellers();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98");
	}
	
	@Test
	public void VerifyPrimeButton() throws InterruptedException
	{
		homepage.ClickOnPrime();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/amazonprime?_encoding=UTF8&ref_=nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9");
	}
	
	@Test
	public void VerifyBuyAgainButton() throws InterruptedException
	{
		homepage.ClickOnBuyAgain();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/gp/buyagain?ie=UTF8&ref_=nav_cs_buy_again_e937cefd3e2e467da8a7d2025be37723");
	}
	
	@Test
	public void VerifyCustomerServiceButton() throws InterruptedException
	{
		homepage.ClickOnCustomerService();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help_79404a52982a4d9d973cf256c713999e");
	}
	
	@Test
	public void VerifyElectronicsButton() throws InterruptedException
	{
		homepage.ClickOnElectronics();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f");
	}
	
	@Test
	public void VerifyGiftCardsButton() throws InterruptedException
	{
		homepage.ClickOnGiftCards();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc_35a9db0a7db34350a3d3cb851062984e");
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		logout.ClickOnSignOut();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}

}

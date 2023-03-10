package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;

public class HomePageTest {
	
	WebDriver driver;
	HomePageObjects hpo;


	@BeforeTest
	public void launchBrowser()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");	
	}
	
	@BeforeClass
	void initializedObjects() {
		hpo= new HomePageObjects(driver);
	}
	@Test(priority= 2 )
	void logoTest() {
boolean logoflag = 	hpo.isLogoPresent();
Assert.assertTrue(logoflag, "Logo verified");
	}
	
	@Test(priority=1)
	void urlTest(String expectedurl)
	{
String actualurl = 	driver.getCurrentUrl();
Assert.assertEquals(actualurl, expectedurl,"URL test successfully");
	}
	@Test(priority=3)
	void verifyFlightsOptions()
	{
boolean flightsflag = hpo.isFlightsOptionPresent();
Assert.assertTrue(flightsflag, "flight option display");
hpo.clickOnFlights();
String actualUrl = driver.getCurrentUrl();
Assert.assertEquals(actualUrl, "https://www.makemytrip.com/flights/","flight page is displayed");
	}
	


}

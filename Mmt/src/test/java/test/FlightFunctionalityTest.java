package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.FlightsPageObjects;
import pageObjects.HomePageObjects;
import utils.Utility;

public class FlightFunctionalityTest {
	
	WebDriver driver;
	HomePageObjects homePageObjects;
	FlightsPageObjects flightsPageObjects;
	
	@BeforeTest
	void startApp(String url,String browser)
	{
		driver= Utility.launchBrowser(url, browser);
		homePageObjects = new HomePageObjects(driver);
		flightsPageObjects = new FlightsPageObjects(driver);
	}
	
	@Test
	void verifyDiffTripOpt() {
	boolean flightsFlag = 	homePageObjects.isFlightsOptionPresent();
	Assert.assertTrue(flightsFlag, "flight option displayed");
	}

}

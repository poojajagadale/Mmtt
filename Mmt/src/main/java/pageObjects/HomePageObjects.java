package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
	WebDriver driver;
	@FindBy (xpath="//img[@alt='Make My Trip']")
private	WebElement logo;
	
	@FindBy (xpath="//span[text()='Flights]//parent::a")
	private	WebElement flights;

public  HomePageObjects(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public boolean isLogoPresent() {

return logo.isDisplayed();	
}
 public void clickOnLogo()
{
	logo.click();
}
 
 public boolean isFlightsOptionPresent() {
	 return flights.isDisplayed();
 }
	    public void clickOnFlights() {
	    	flights.click();
	    }
}	
	
	               



package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FlightsPageObjects {
	@FindBy (xpath =  "//li[@data-cy='oneWayTrip']")
	private WebElement oneWayTripCheckbox;
	
	@FindBy (xpath = "//li[@data-cy='roundTrip']")
	private WebElement roundTripCheckbox;
	
	@FindBy (xpath = "//li[@data-cy='mulitiCityTrip']")
	private WebElement multiCityTripCheckbox;
	
public 	FlightsPageObjects(WebDriver driver) {
PageFactory.initElements(driver, this);
}

 public boolean isoneWayTripCheckboxPresent()
{
	return oneWayTripCheckbox.isDisplayed();
}

 public boolean isRoundTripCheckboxPresent()
{
	return roundTripCheckbox.isDisplayed();
}
 public boolean isMultiCityTripCheckboxPresent()
{
	return multiCityTripCheckbox.isDisplayed();
}
 
 public String grabAttributeOfWayTrip(String attribute)
 {
	 return oneWayTripCheckbox.getAttribute(attribute);
 }
}

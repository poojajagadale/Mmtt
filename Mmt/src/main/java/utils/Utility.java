package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	
static		WebDriver driver;
public static WebDriver launchBrowser(String url,String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	return driver;

	}

}

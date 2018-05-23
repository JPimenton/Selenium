package es.fpdual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverChrome extends DriverSelenium{
	
	private static final String CHROME_PROFILE_DEFAULT = "default";

	public DriverChrome(){
		
	final StringBuilder path = new StringBuilder();
	
	path.append("C:\\gecko\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",  path.toString());
	driver = new ChromeDriver();
	final ChromeOptions options = new ChromeOptions();
	
	}
}

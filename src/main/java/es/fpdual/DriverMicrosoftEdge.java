package es.fpdual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverMicrosoftEdge extends DriverSelenium {

	private static final String CHROME_PROFILE_DEFAULT = "default";

	public DriverMicrosoftEdge() {

		final StringBuilder path = new StringBuilder();

		path.append("C:\\gecko\\MicrosoftWebDriver.exe");
		System.setProperty("webdriver.edge.driver", path.toString());
		WebDriver driver = new EdgeDriver();
		final EdgeDriver options = new EdgeDriver();
	}
}
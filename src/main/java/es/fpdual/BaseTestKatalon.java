package es.fpdual;

import java.io.IOException;

public class BaseTestKatalon {

	public static void main(String[] args) throws IOException {
		
		DriverChrome driver = new DriverChrome();
		driver.getDriver().get("http://www.google.es");
	}
}

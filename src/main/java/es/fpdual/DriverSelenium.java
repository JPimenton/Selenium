package es.fpdual;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public abstract class DriverSelenium {

	static protected WebDriver driver;
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void cerrarProceso() throws IOException {
		
		if (getDriver() instanceof DriverSeleniumFirefox) {
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver64.exe");
		}else {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver64.exe");
		}
		System.out.println("Prueba finalizada");
	}
}

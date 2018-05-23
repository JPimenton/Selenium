package es.fpdual;

import java.io.IOException;

public class BaseTestEdge {

	public static void main(String[] args) throws IOException {
		
		DriverMicrosoftEdge driver = new DriverMicrosoftEdge();
		driver.getDriver().get("http://www.google.es");
		driver.cerrarProceso();
	}
}

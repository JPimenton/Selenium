package es.fpdual;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseTestEdge {

	public static void main(String[] args) throws IOException {
		
		DriverMicrosoftEdge driver = new DriverMicrosoftEdge();
		driver.getDriver().get("https://www.google.es");
		
		driver.getDriver().findElement(By.id("lst-ib")).sendKeys("lista convocados selección española mundial 2018 RTVE");
		driver.getDriver().findElement(By.name("btnK")).click();
		System.out.println(driver.getDriver().findElement(By.id("resultStats")).getText());
		
		driver.getDriver().findElement(By.partialLinkText("Mundial 2018 | Selección española - RTVE.es")).click();
		
		
		
		
		List<WebElement> list = driver.getDriver().findElement(By.className("section")).findElements(By.tagName("p"));
		
		for (WebElement elemento : list) {
		System.out.println(elemento.getText());
		System.out.println();
		}
		driver.cerrarProceso();
	}
}

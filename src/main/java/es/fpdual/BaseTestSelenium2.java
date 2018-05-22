package es.fpdual;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestSelenium2 {
	public static void main(String[] args) throws IOException {

		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
		final WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);
		
		driver.getDriver().get("https://www.google.es");
		
		driver.getDriver().findElement(By.id("lst-ib")).sendKeys("Primefaces Showcase");
		driver.getDriver().findElement(By.name("btnK")).click();
		
		driver.getDriver().findElement(By.partialLinkText("PrimeFaces ShowCase")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("SubMenu-Data")));
		
		driver.getDriver().findElement(By.id("SubMenu-Data")).click();
		
		driver.getDriver().findElement(By.partialLinkText("• DataTable")).click();
		
		List<WebElement> list = driver.getDriver().findElements(By.className("ui-column-title"));
		
		for (WebElement elemento : list) {
			System.out.println(elemento.getText());
			
			System.out.println("");
			}
		driver.cerrarProceso();
	}

}

package es.fpdual;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestSelenium3 {

		public static void main(String[] args) throws IOException {

			DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
			final WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);
			Actions action = new Actions(driver.getDriver());
			
			driver.getDriver().get("https://www.primefaces.org/ultima/dashboard.xhtml");
	
			driver.getDriver().findElement(By.id("menuform:um_components")).click();
			driver.getDriver().findElement(By.id("menuform:um_messages")).click();
			
//			action.moveToElement(driver.getDriver().findElement(By.id("j_idt50:dialog2")));
//			action.click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt50:dialog2")));
//			
//			driver.getDriver().findElement(By.id("j_idt50:dialog2")).click();
//			
			
			
			driver.getDriver().findElement(By.id("j_idt51:default")).sendKeys("Usuario");
			driver.getDriver().findElement(By.id("j_idt51:txt")).sendKeys("Contrasenya");
			driver.getDriver().findElement(By.id("j_idt51:icon")).sendKeys("Javier");
			driver.getDriver().findElement(By.id("j_idt51:inline")).sendKeys("Garcia");
			
			driver.getDriver().findElement(By.id("j_idt51:mtext_label")).click();
			driver.getDriver().findElement(By.id("j_idt51:mtext_2")).click();
			
			driver.getDriver().findElement(By.id("j_idt51:micon")).sendKeys("Pimiento");
			driver.getDriver().findElement(By.id("j_idt51:submitButton")).click();
			
			String alerta = driver.getDriver().findElement(By.className("ui-messages-info-detail")).getText();
			
			if (alerta.equals("Premium Layout")) {
				System.out.println("Todo correcto");
			}
		}
}



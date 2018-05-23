package es.fpdual;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import es.fpdual.DriverSeleniumFirefox;

public class Testeo {
	
	DriverSeleniumFirefox driver; 
	
	@Before
	public void test(){
		driver = new DriverSeleniumFirefox();
	}
	
	@Test
	public void tester() throws IOException {
		try {
		
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
			this.takeScreenshot("C:\\caps\\capturaok");
		}catch(Exception e) {
			this.takeScreenshot("C:\\caps\\capturaerr");
		}finally {
			driver.cerrarProceso();
		}
	}
	
	public void takeScreenshot(String ruta) {
		System.out.println("Realizando Captura...");
		TakesScreenshot obj = (TakesScreenshot)driver.getDriver();
		File origen = obj.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		String date = LocalDateTime.now()+"";
		File destino = new File(ruta+date.replace(":", "-")+".png");
		
		try {
			FileUtils.copyFile(origen,destino);
			System.out.println("Captura realizada");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

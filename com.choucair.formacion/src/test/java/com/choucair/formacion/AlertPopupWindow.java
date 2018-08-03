package com.choucair.formacion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)
public class AlertPopupWindow {

	@Managed(driver="chrome", uniqueSession = true)
	WebDriver driver;	
	
	@Test
	public void pruebaobj() throws AWTException, MalformedURLException {

		//urlpruebaPage.open();
		//urlpruebaPage.seleccionar_menu();
		//WiniumDriver Eldriver;
		DesktopOptions option = new DesktopOptions();
		//Eldriver = new WiniumDriver(new URL("http://localhost:9999"),option);
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		option.setDebugConnectToRunningApp(true);
		option.setApplicationPath("C:\\Program Files\\internet explorer\\iexplore.exe");
		
		driver.findElement(By.name("cusid")).sendKeys("53920");					
		driver.findElement(By.name("submit")).click();
		
		
		
		//Eldriver.findElement(By.name("Aceptar")).click();
/*		
 * 
 * 		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert  myalert = wait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
*/

		System.out.println("Hola Mundo");
		
	}
	
}

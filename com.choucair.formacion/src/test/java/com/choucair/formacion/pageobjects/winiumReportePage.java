package com.choucair.formacion.pageobjects;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import utilities.utilidadesEvidencias;

@DefaultUrl("file:///D:/exito/evidencia.png")
public class winiumReportePage extends PageObject{

	public void abrirApp(String elPrograma, String rutaWinium) throws Exception {
		utilidadesEvidencias.abrirProgramaN(rutaWinium, elPrograma);
		
	}

	

	public void autenticacion() {
		
		System.out.println("Hola");
		utilidadesEvidencias.driver.findElement(By.className("TextBox")).click();
		utilidadesEvidencias.driver.findElement(By.className("TextBox")).sendKeys("Holamudno");
		utilidadesEvidencias.driver.findElement(By.className("PasswordBox")).click();
		utilidadesEvidencias.driver.findElement(By.className("PasswordBox")).sendKeys("password");
		utilidadesEvidencias.driver.findElement(By.className("TextBlock")).click();
		
		
		
		
	}

	
	

}

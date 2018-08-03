package com.choucair.formacion.pageobjects;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

public class colorLibColeccionPage extends PageObject{
	
	
	@FindBy(xpath="//*[@id=\'menu\']")
	WebElement elMenu;
	
	@FindBy(xpath="//*[@id=\'menu\']/li/a")
	List<WebElement> elMenuIzquierdo;
	 	
	public void seleccionaMenuDeseado(String nombreOpcion)
	{
		//WebElement elItemDeseado=elMenu.findElement(By.linkText(nombreOpcion));
		WebElement elItemDeseado=elMenu.findElement(By.buttonText(nombreOpcion));
		elItemDeseado.click();
		
	}
	
	
	
	public void verificarQueTodosLosMenuFuncionan() throws InterruptedException
	{
		int i=1;
		int tam=elMenuIzquierdo.size();
		String url=this.getDriver().getCurrentUrl();
		
		for(i=0;i<tam;i++)
		{
			WebElement opcion=elMenuIzquierdo.get(i);
			String nombre=opcion.getText();
			if(nombre.trim()!="")
			{
				opcion=elMenu.findElement(By.buttonText(nombre.trim()));
			    opcion.click();
			    String NUrl=this.getDriver().getCurrentUrl();
			    if(url.equals(NUrl)==false)
			    {
			    	Thread.sleep(3000);
			    	this.getDriver().navigate().back();
			    }
			}
			
			Thread.sleep(3000);
						
		}
		this.getDriver().navigate().back();
	}
	
	
	
}

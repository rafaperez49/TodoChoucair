	package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class IntermediaMenuBuscar  extends PageObject{

	//Ingresar documento
	///html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[7]/input
	 @FindBy(name="identificacion")
	//@FindBy(xpath="//*[@id='/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[7]/input")
	public WebElement txtidentificacion;
	
	//BotonBuscar 
	@FindBy(name="tablaicobuscar")
	public WebElement btnBuscar;
	
	//BotonEditar
	@FindBy(name="tablaicoeditar")
	public WebElement btnEditar;
	
	public void Buscar_EditValidation(String usuario) 
	
	{	
		txtidentificacion.sendKeys(usuario);
		btnBuscar.click();
		btnEditar.click();
		
	}
	
		
	public void saltarFrame()
	{
		this.getDriver().switchTo().defaultContent();
		this.getDriver().switchTo().frame("topFrame");
		this.getDriver().switchTo().frame("mainFrameMiddle");
		
	}
	
	
	
	
}

package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class colorlibForValidationsPopupsPage extends PageObject{
	
	
	@FindBy (xpath="//*[@id='req']")
	public WebElementFacade requerido;
	
	@FindBy (xpath="//*[@id=\'sport\']") 
	public WebElementFacade seleccion;
	
	@FindBy (xpath="//*[@id=\'sport2\']")
	public WebElementFacade seleccion2;
	
	@FindBy (xpath="//*[@id=\'url1\']")
	public WebElementFacade url;
	
	@FindBy (xpath="//*[@id=\'email1\']")
	public WebElementFacade email;
	
	@FindBy (xpath="//*[@id=\'pass1\']")
	public WebElementFacade password;
	
	@FindBy (xpath="//*[@id=\'pass2\']")
	public WebElementFacade password2;
	
	@FindBy (xpath="//*[@id=\'minsize1\']")
	public WebElementFacade minsize;
	
	@FindBy (xpath="//*[@id=\'maxsize1\']")
	public WebElementFacade maxsize;
	
	@FindBy (xpath="//*[@id=\'number2\']")
	public WebElementFacade number;
	
	@FindBy (xpath="//*[@id=\'ip\']")
	public WebElementFacade ip;
	
	@FindBy (xpath="//*[@id=\'date3\']")
	public WebElementFacade date;
	
	@FindBy (xpath="//*[@id=\'past\']")
	public WebElementFacade date2;
	
	@FindBy (xpath="//*[@id=\'popup-validation\']/div[14]/input")
	public WebElementFacade btnValidar;
	
	@FindBy (xpath="//*[@id=\'popup-validation\']/div[1]/div/div/div[1]") //FORM[@id='popup-validation']
	public WebElementFacade ventanaPopup;

	@FindBy (xpath="//*[@id=\'content\']/div/div/div[2]/div/div/header/div[2]/nav/a[3]/i") 
	public WebElementFacade cerrar1;
	
	@FindBy (xpath="//*[@id=\'content\']/div/div/div[3]/div/div/header/div[2]/nav/a[3]/i") 
	public WebElementFacade cerrar2;
	
	
	public void cerrarHeaders()
	{
		cerrar2.click();
		cerrar1.click();
		
		
	}
	
	
	
	public void ingresarRequerido(String datoPrueba)
	{
		requerido.click();
		requerido.clear();
		requerido.sendKeys(datoPrueba);
	}
	public void ingresarDeportes(String datoPrueba)
	{
		seleccion.click();
		seleccion.selectByVisibleText(datoPrueba);
	}
	public void ingresarDeportesVarios(int k)
	{
		seleccion2.selectByIndex(k);
	}
	public void ingresarUrl(String datoPrueba)
	{
		url.click();
		url.clear();
		url.sendKeys(datoPrueba);
	}
	public void ingresarEmail(String datoPrueba)
	{
		email.click();
		email.clear();
		email.sendKeys(datoPrueba);
		
	}
	public void ingresarPassword(String datoPrueba)
	{
		password.click();
		password.clear();
		password.sendKeys(datoPrueba);
	}
	public void ingresarPassword2(String datoPrueba)
	{
		password2.click();
		password2.clear();
		password2.sendKeys(datoPrueba);
	}
	public void ingresarminSize(String datoPrueba)
	{
		minsize.click();
		minsize.clear();
		minsize.sendKeys(datoPrueba);
	}
	public void ingresarMaxSize(String datoPrueba)
	{
		maxsize.click();
		maxsize.clear();
		maxsize.sendKeys(datoPrueba);
	}
	public void ingresarNumer(String datoPrueba)
	{
		number.click();
		number.clear();
		number.sendKeys(datoPrueba);
	}
	public void ingresarIP(String datoPrueba)
	{
		ip.click();
		ip.clear();
		ip.sendKeys(datoPrueba);
	}
	public void ingresarDate(String datoPrueba)
	{
		date.click();
		date.clear();
		date.sendKeys(datoPrueba);
	}
	public void ingresarDate2(String datoPrueba)
	{
		date2.click();
		date2.clear();
		date2.sendKeys(datoPrueba);
	}
	public void presionarValidar()
	{
		btnValidar.click();
	}
	
	public void formSinError()
	{
		assertThat(ventanaPopup.isPresent(), is(false));
	}
	public void formConError()
	{
		assertThat(ventanaPopup.isCurrentlyVisible(), is(true));
	}

	
}

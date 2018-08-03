package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.is;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SveObjectsInfoPago extends PageObject {

	
	//Información Básica del Pago
    
    //Tipo de Pago
    @FindBy (id ="fileType")
    public WebElementFacade cmbtipopago;
    
    //Modelo
    @FindBy (xpath = "//*[@id='modelInfo']")
    public WebElementFacade txtmodelo;
    
    //Nombre
    @FindBy (xpath = "//*[@id='loteId']")
    public WebElementFacade txtnombre;
    
    //Cuenta a Debitar
    
    @FindBy (xpath = "//*[@id='sourceAccount']")
    public WebElementFacade cmbcuenta;
    
    //Tipo de Aplicación
    
    @FindBy (xpath = "//*[@id='tipoaplicacion']")
    public WebElementFacade cmbapli;
    		
    //Fecha Aplicacion
    
    @FindBy (xpath ="//*[@id='date']")
    public WebElementFacade txtfecha;
    
    //Boton Continuar
    
    @FindBy (xpath = "//*[@id='forma']/div/p/input[1]")
    public WebElementFacade btncontinuar;
    
    
    //GloboError
    @FindBy (xpath = "//*[@id='forma']/table/tbody/tr[3]/td[2]/label/a/img")
    public WebElementFacade globoinfor;
    
    
    public void Tipopago (String strDatoprueba) {
    	
    
    	cmbtipopago.click();
    	cmbtipopago.selectByVisibleText(strDatoprueba);
    	
    	
    }
    
    
    public void Modelo (String strDatoprueba) {
    	txtmodelo.click();
    	txtmodelo.selectByVisibleText(strDatoprueba);
    	
    }
    
    public void saltarFrame() {
		
		this.getDriver().switchTo().defaultContent();	
		this.getDriver().switchTo().frame("TransactionFrame");
		
		
				
	}
    
    
    public void Nombre (String strDatoprueba) {
    	txtnombre.click();
    	txtnombre.clear();
    	txtnombre.sendKeys(strDatoprueba);
    	
    }
    
    public void Cuenta (String strDatoprueba) {
    	cmbcuenta.click();
    	cmbcuenta.selectByVisibleText(strDatoprueba);
    	
    }

    public void Aplicacion (String strDatoprueba) {
    	cmbapli.click();
    	cmbapli.selectByVisibleText(strDatoprueba);
    	
    }
    
    public void Fecha (String strDatoprueba) {
    	txtfecha.click();
    	txtfecha.clear();
    	txtfecha.sendKeys(strDatoprueba);
    	
    }
    
    public void Continuar () {
    	 btncontinuar.click();

    }
    
    public void Ingreso_sin_errores() {
    	
    	assertThat(globoinfor.isCurrentlyVisible(), is(false));
	  
    }
    
    public void Ingreso_con_errores() {
    	assertThat(globoinfor.isCurrentlyVisible(), is(true));
    }
   


}

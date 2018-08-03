package com.choucair.formacion.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


//@DefaultUrl ("https://svebc.qa03.todo1.com/SVE/control/BoleTransactional.bancolombia")

public class SveObjectsLoguin  extends PageObject{
	
      //Campo NIT
		
		@FindBy (xpath = "//*[@id='COMPANYID']")
		public WebElementFacade txtnit;
		
		//Campo Usuario
		
		@FindBy (xpath = "//*[@id='CLIENTID']")
		public WebElementFacade txtusuario;
		
	
		
		//Boton Aceptar
		
		@FindBy (xpath = "//*[@id='forma']/table[1]/tbody/tr[3]/td[1]/div[2]/input[2]")
		public WebElementFacade btnaceptar;
		
		
		//Label Empresas
		
		@FindBy (xpath = "//*[@id='top']/h2")
		public WebElementFacade lblempresas;
		
		@FindBy (id="USERPASS")
		public WebElementFacade txtClave;
		
		//Autenticación Token
		@FindBy(id = "Posponer")
		public WebElementFacade btnPosponer;
		
		public void Abrir_URL (){
		    getDriver().get("https://svebc.qa01.todo1.com/SVE/control/BoleTransactional.bancolombia");
		}
		
			
		public void IngresarDatos (String strNit, String strUsuario, String StrClave) throws InterruptedException {
			txtnit.sendKeys(strNit);
			txtusuario.sendKeys(strUsuario);
			//Ingreso de la clave por teclado en imagen
			JavascriptExecutor js = (JavascriptExecutor)this.getDriver();  
			txtClave.click();
			//declaro una varaible entero para convertir cada digito en un entero y controlarlo por error.
			int DigitoNumeric = 0;
			
			for (int i = 0; i < StrClave.length(); i++) {
				String DigitoClave = StrClave.substring(i, i+1).toUpperCase();
				try
		         {
					DigitoNumeric = Integer.parseInt(DigitoClave);
					js.executeScript("writeNumeric('" + DigitoNumeric + "');");
		         }
		         catch(Exception e)
		         {
		        	 System.out.println("Entro Alfabetico: " + DigitoClave);
		        	 js.executeScript("writeAlpha('" + DigitoClave + "');");
		         }
			}
			
			btnaceptar.click();
			
			
			
	}
		
		public void clickEnPosponer()
		{
			btnPosponer.click();
		}
		

		public void Verificar_Inicio(){

		String label = "Mis Mensajes";
		String strMensaje = lblempresas.getText();
		assertThat (strMensaje, containsString(label));
		
	}
		
		

		}



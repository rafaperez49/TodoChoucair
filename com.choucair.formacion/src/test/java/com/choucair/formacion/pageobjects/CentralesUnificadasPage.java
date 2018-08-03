package com.choucair.formacion.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


//definir url para ingresar
@DefaultUrl("https://serviciosqapseries.bancolombia.corp/web-centrales-unificadas/jsp/login.faces")

public class CentralesUnificadasPage extends PageObject {
	
	
	//Objetos de Logueo de Seccion
	

	//usuario
	@FindBy(id="loginForm:usuario")
	public WebElementFacade txtUsuario;
	
	//clave
	@FindBy(id="loginForm:clave")
	public WebElementFacade txtClave;
	
	//boton Aceptar
	@FindBy(id="loginForm:enter")
	public WebElementFacade btnAceptar;
	
	
	//metodo para realizar el logueo del usuario
	public void InicioSeccion(String strUsuario, String strPsw)
	{
			txtUsuario.sendKeys(strUsuario);
			txtClave.sendKeys(strPsw);
			btnAceptar.click();
	}
	
	
	//metodo para verificar que se ha realizado el logueo de manera correcta
	
	//objetos del menu principal
	@FindBy(id="iconj_id14:opcionMenu_12")
	public WebElementFacade CalifCentralInterna;
	
	@FindBy(id="iconj_id14:opcionMenu_13")
	public WebElementFacade CentInterna;
	
	
	public void IngresoOpcionMenu()
	{
		CalifCentralInterna.click();
		CentInterna.click();
		
	}
	//datos del formulario para realizar la consulta
	
	@FindBy(name="calIntForm:j_id28")
	public WebElementFacade TipoDcto;
	
	@FindBy(id="calIntForm:nroDocumento")
	public WebElementFacade NroDcto;
	
	@FindBy(id="calIntForm:j_id36")
	public WebElementFacade btnConsultar;
	
	@FindBy(name="j_id19:j_id115")
	public WebElementFacade btnCancelar;
	
	
	@FindBy(xpath="//*[@id=\"j_id19\"]/div/div[2]/table[1]/tbody")//*[@id="j_id19"]/div/div[2]/table[1]/tbody
	public List<WebElement> tblResultado;
	
	public void tablaResultado()
	{
			List<WebElement> lasFilasTabla=this.getDriver().findElements(By.xpath("//*[@id=\"j_id19\"]/div/div[2]/table[1]/tbody/tr"));
			int numeroDeFilas=lasFilasTabla.size();
			int numeroDeColumnas;
			List<WebElement> lasColumnasTabla=this.getDriver().findElements(By.xpath("//*[@id=\"j_id19\"]/div/div[2]/table[1]/tbody/tr/td"));
			numeroDeColumnas=lasColumnasTabla.size()/numeroDeFilas;
			
			for(int i=1;i<=numeroDeFilas;i++)
			{
				
				for (int j = 2; j <= numeroDeColumnas; j++) 
				{
					String elDato=this.getDriver().findElement(By.xpath("//*[@id=\"j_id19\"]/div/div[2]/table[1]/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println(elDato);
				}
			
				
			}
			
		
		
	}
	
	
	
	public void TipoDocumento(String dato)
	{
		TipoDcto.click();
		TipoDcto.selectByVisibleText(dato);
	}
	
	public void NroDocumento(String dato)
	{
		NroDcto.click();
		NroDcto.clear();
		NroDcto.sendKeys(dato);
		
	}
	
	public void ConsultarCliente()
	{
		
		btnConsultar.click();
	}
	
	public void Cancelar()
	{
		btnCancelar.click();
	}
	
		
}

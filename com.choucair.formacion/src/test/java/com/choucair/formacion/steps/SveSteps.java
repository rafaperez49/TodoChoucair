package com.choucair.formacion.steps;

import java.awt.AWTException;

import com.choucair.formacion.pageobjects.SveMenuObject;
import com.choucair.formacion.pageobjects.SveObjectsLoguin;

import net.thucydides.core.annotations.Step;

public class SveSteps {
	
	SveMenuObject svemenuobject;
	SveObjectsLoguin sveobjectsloguin;
	
	
	@Step
	public void login_sve(String strNit, String strUsuario) throws InterruptedException {
		
		//Ingresar Datos
		
		 sveobjectsloguin.IngresarDatos(strNit, strUsuario, "bole2222");
		
		//e. Verificar la Autenticación
		
		 sveobjectsloguin.Verificar_Inicio();
		
		
		}
		
	//Ingreso a Pago Nomina Manual
		@Step
	    public void ingresar_form_pago() throws InterruptedException, AWTException{
			 svemenuobject.pagonomina();
	  }
		
		
}



	
	



package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.IntermediaLoginPage;
import com.choucair.formacion.pageobjects.IntermediaMenuBuscar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.thucydides.core.annotations.Step;

public class IntermediaValidationSteps {

	// 2.1  instanciar una clase que agregaremos para los objetos del login
			IntermediaLoginPage intermediaLoginPage;
			IntermediaMenuBuscar intermediaMenuBuscar;
			
		// 2.2 Crear el método que va a contener los pasos para lograr la autenticación
			@Step
			public void login_Intermedia(String strUsuario, String strPass)
			{
				// 2.3 - a.Abrir navegador con la URL de prueba
			 	intermediaLoginPage.open();  
				// b. Ingresar usuario demo
				// c. Ingresar password demo
				// d. Click en boton Sign in
				// 2.4 agregamos el método “IngresarDatos”, el cual recibirá los parámetros Usuario
				// y Clave que vienen de la definition
			 	intermediaLoginPage.IngresarDatos(strUsuario,strPass);
				//2.5 Método para la verificación de un label existente en el Home de la aplicación
				// e.Verificar la autenticación (label en home)
			 	//intermediaLoginPage.VerificarHome_correct();
			 //	intermediaLoginPage.VerificarHome_incorrect();
			}
		 
			@Step
			public void BuscarMenu_Intermedia(String usuario)
			{
				//String winHandleBefore = intermediaLoginPage.getDriver().getWindowHandle();
				intermediaLoginPage.btnSignIn.click();
				//intermediaLoginPage.getDriver().switchTo().
				
				
				
				intermediaMenuBuscar.saltarFrame();
				intermediaMenuBuscar.Buscar_EditValidation(usuario);
			}
}

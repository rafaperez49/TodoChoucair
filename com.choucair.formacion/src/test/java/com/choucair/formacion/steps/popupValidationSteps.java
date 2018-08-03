package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibMenuPage;
import com.choucair.formacion.pageobjects.colorLibLoginPage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class popupValidationSteps{

	colorLibLoginPage elColorlibLoginPage;
	ColorlibMenuPage elColorlibMenuPage;
	
	@Step
	public void login_ColorLib(String usuario, String password)
	{
		elColorlibLoginPage.open();
		elColorlibLoginPage.insertarDatos(usuario, password);
		
		System.out.println(elColorlibLoginPage.getUsuario());
		System.out.println(elColorlibLoginPage.getPassword());
		
		elColorlibLoginPage.verificarHome();
	}
	
	@Step
	public void ingresar_form_validation()
	{
		elColorlibMenuPage.menuFormsValidation();
	}
	
	
}

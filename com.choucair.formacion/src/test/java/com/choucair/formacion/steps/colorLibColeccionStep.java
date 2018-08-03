package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.colorLibColeccionPage;

import net.thucydides.core.annotations.Step;

public class colorLibColeccionStep {
	
	colorLibColeccionPage elColorLibColeccionPage;
	
	@Step
	public void ingresarAMenu(String nombreOpcion) throws InterruptedException
	{
		elColorLibColeccionPage.seleccionaMenuDeseado(nombreOpcion);		
	}
	
	@Step
	public void clickearMenus() throws InterruptedException
	{
		elColorLibColeccionPage.verificarQueTodosLosMenuFuncionan();
		
	}
	

}

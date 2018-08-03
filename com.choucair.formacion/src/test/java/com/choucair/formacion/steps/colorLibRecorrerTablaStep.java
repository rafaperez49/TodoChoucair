package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibMenuPage;
import com.choucair.formacion.pageobjects.colorLibRecorrerTablaPage;

import net.thucydides.core.annotations.Step;

public class colorLibRecorrerTablaStep {
	
	
	colorLibRecorrerTablaPage elColorLibRecorrerTablaPage;
	
	ColorlibMenuPage elColorLibMenuPage;
	
	@Step
	public void ingresar_Tables_Form()
	{
		elColorLibMenuPage.menuTablesForm();
		
	}
	@Step
	public void recorrer_la_Tabla()
	{
		elColorLibRecorrerTablaPage.recorrerTabla();
	}

}

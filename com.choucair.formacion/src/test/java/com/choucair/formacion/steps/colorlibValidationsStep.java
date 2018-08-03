package com.choucair.formacion.steps;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.choucair.formacion.pageobjects.colorlibForValidationsPopupsPage;

import net.thucydides.core.annotations.Step;
 
public class colorlibValidationsStep {
	
	colorlibForValidationsPopupsPage elColorlibForValidationsPage;
	
	@Step
	public void diligenciarFormulario(List<List<String>> data, int i) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		
			if(i==1)
				elColorlibForValidationsPage.cerrarHeaders();	
			elColorlibForValidationsPage.ingresarRequerido(data.get(i).get(0).trim());
			elColorlibForValidationsPage.ingresarDeportes(data.get(i).get(1).trim());
			elColorlibForValidationsPage.ingresarDeportesVarios(3);
			elColorlibForValidationsPage.ingresarDeportesVarios(2);
			elColorlibForValidationsPage.ingresarUrl(data.get(i).get(4).trim());
			elColorlibForValidationsPage.ingresarEmail(data.get(i).get(5).trim());
			elColorlibForValidationsPage.ingresarPassword(data.get(i).get(6).trim());
			elColorlibForValidationsPage.ingresarPassword2(data.get(i).get(7).trim());
			elColorlibForValidationsPage.ingresarminSize(data.get(i).get(8).trim());
			elColorlibForValidationsPage.ingresarMaxSize(data.get(i).get(9).trim());
			elColorlibForValidationsPage.ingresarNumer(data.get(i).get(10).trim());
			elColorlibForValidationsPage.ingresarIP(data.get(i).get(11).trim());
			elColorlibForValidationsPage.ingresarDate(data.get(i).get(12).trim());
			elColorlibForValidationsPage.ingresarDate2(data.get(i).get(13).trim());
			elColorlibForValidationsPage.presionarValidar();
		
	}
	
	@Step
	public void verificar_formulario_exitoso()
	{
		elColorlibForValidationsPage.formSinError();
	}
	
	@Step
	public void verificar_formulario_con_error()
	{
		elColorlibForValidationsPage.formConError();
	}
	
	

}

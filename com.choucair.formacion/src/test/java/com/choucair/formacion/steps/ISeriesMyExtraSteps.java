package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ISeriesMyExtraPage;

import net.thucydides.core.annotations.Step;

public class ISeriesMyExtraSteps {
	
	ISeriesMyExtraPage iSeriesMyExtraPage;
	
	@Step
	public void Abrir_Extra(String rutaCalidad) throws InterruptedException{
			iSeriesMyExtraPage.iniciar_Extra(rutaCalidad);
	}
	@Step
	public void Autenticar_Extra(String strUsuario, String strClave) throws InterruptedException{
		if (iSeriesMyExtraPage.Sess0 != null) {
			iSeriesMyExtraPage.Autenticar_Extra(strUsuario, strClave); }
		else {
			System.out.println("No es posible ejecutar no se cuenta con una sesion activa");
		}
	}
	
	@Step
	public void Ingresar_A_Un_Menu(String tipoCodigo)
	{
		iSeriesMyExtraPage.seleccionarUnMenu(tipoCodigo);
		
	}
	
}

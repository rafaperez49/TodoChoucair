package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.CentralesUnificadasPage;

import net.thucydides.core.annotations.Step;

public class CentralesUnificadasSteps {

	CentralesUnificadasPage centralesUnificadasPage;

	//metodo para acceder a la aplicacion
	
	@Step
	public void LoginUsuario(String strUsuario, String strPsw)
	{
		centralesUnificadasPage.open();
		//invocar metodo para realizar el logueo
		centralesUnificadasPage.InicioSeccion(strUsuario, strPsw);
	
	}
	
	
	//metodo para realizar el ingreso  a la opcion de central interna
	@Step
	public void IngresoMenu()
	{
		centralesUnificadasPage.IngresoOpcionMenu();
		
	}
	
	@Step
	public void RegistroInformacionCons(List<List<String>> data, int id)
	{
		
		//Ingreso de los datos requeridos
		centralesUnificadasPage.TipoDocumento(data.get(id).get(0).trim());
		centralesUnificadasPage.NroDocumento(data.get(id).get(1).trim());
		centralesUnificadasPage.ConsultarCliente();
		centralesUnificadasPage.tablaResultado();
		centralesUnificadasPage.Cancelar();
		
		
	}
	
	
}

package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.CentralesUnificadasSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CentralesUnificadasDefinition {

	
	@Steps
	CentralesUnificadasSteps centralesUnificadasSteps;

	
	//logueo
	@Given("^Se inicia sección en el formulario web CUN con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void se_inicia_sección_en_el_formulario_web_CUN_con_usuario_y_clave(String strUsuario, String strPsw) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		centralesUnificadasSteps.LoginUsuario(strUsuario, strPsw);
		
		
	}

	//ingreso opcion de menu
	@Given("^ingreso a la funcionalidad Consulta Central Interna$")
	public void ingreso_a_la_funcionalidad_Consulta_Central_Interna() throws Throwable {
		
		centralesUnificadasSteps.IngresoMenu();
	   
	}
	
	//ingreso los datos de consulta
	@When("^Cuando diligencio el formulario$")
	public void cuando_diligencio_el_formulario(DataTable DtDatosConsulta) throws Throwable {
	   
		List<List<String>> data=DtDatosConsulta.raw();
		
		for (int i=1;i<data.size();i++)
		{
			centralesUnificadasSteps.RegistroInformacionCons(data, i);
			
			try
			{
				Thread.sleep(15000);
			}catch(InterruptedException e) {}
		}
		
			
	}
	

		
	
	
	
}

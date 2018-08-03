package com.choucair.formacion.definition;

import java.io.IOException;

import com.choucair.formacion.steps.winiumReporteSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class winiumReporteDefinition {
	
	@Steps
	winiumReporteSteps elWiniumReporteSteps;
		

	@Given("^abrir la aplicacion \"([^\"]*)\" usando Winium \"([^\"]*)\"$")
	public void abrir_la_aplicacion(String elPrograma, String rutaWinium) throws Exception  {
	   
		elWiniumReporteSteps.abreLaAplicacion(elPrograma, rutaWinium);
	}

	@When("^ingresar usuario y clave$")
	public void ingresar_usuario_y_clave(){
	   elWiniumReporteSteps.autentica();
	}

	@Then("^generar reporte \"([^\"]*)\"$")
	public void generar_reporte(String rutaEvidencia) throws Throwable{
		elWiniumReporteSteps.verificaIngresoFallido(rutaEvidencia);
	  
	}


}

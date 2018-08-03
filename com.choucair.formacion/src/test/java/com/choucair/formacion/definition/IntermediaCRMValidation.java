package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.IntermediaValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IntermediaCRMValidation {

	@Steps
	IntermediaValidationSteps intermediaValidationSteps;


	@Given("^Autentico en Intermedia con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_Intermedia_con_usuario_y_clave(String strUsuario, String strPass) {
	    // Write code here that turns the phrase above into concrete actions
		intermediaValidationSteps.login_Intermedia(strUsuario, strPass);
	}

	
	@Given("^Busco_Edito cliente por usuario \"([^\"]*)\"$")
	public void busco_edito_cliente_por_usuario(String usuario) {
	    // Write code here that turns the phrase above into concrete actions
		intermediaValidationSteps.BuscarMenu_Intermedia(usuario);
		
	}

	@When("^Modifico informacion general$")
	public void modifico_informacion_general(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
	}

	@Then("^verifico actualizacion exitosa$")
	public void verifico_actualizacion_exitosa() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
}

package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BackendAs400db2S4tep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import utilities.DBManager;

public class BackendAs400db2Definition {
	
	
	
	@Steps
	BackendAs400db2S4tep backEndAs400db2Step;
	@Given("^Consultar TMPCNOMBRE$")
	public void consultar_TMPCNOMBRE(DataTable dtDatosPrueba) throws Throwable {
		List<List<String>>	data=dtDatosPrueba.raw();
		
		backEndAs400db2Step.consultarCNAME(data);
		
	}

}

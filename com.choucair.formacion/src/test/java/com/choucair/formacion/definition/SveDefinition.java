package com.choucair.formacion.definition;

import java.util.List;


import com.choucair.formacion.pageobjects.SveMenuObject;
import com.choucair.formacion.pageobjects.SveObjectsLoguin;
import com.choucair.formacion.steps.SveValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SveDefinition {
	
	@Steps
	SveObjectsLoguin  svebbjectsloguin;
	
	@Steps 
	
	SveValidationSteps svesalidationsteps;
	
	@Steps
	SveMenuObject svemenuobject;
	
	@Given("^Cargo URL$")
	public void cargo_URL() throws Throwable {
	   
			svebbjectsloguin.Abrir_URL();
		}  
	
	@Given("^Autentico en SVE con nit \"([^\"]*)\", usuario \"([^\"]*)\"$")
	public void autentico_en_SVE_con_nit_usuario(String strNit, String strUsuario, String clave) throws Throwable {
		svebbjectsloguin.IngresarDatos(strNit, strUsuario, clave);
		svebbjectsloguin.clickEnPosponer();
		
	}


	@Given("^Selecciono la opcion para pago de nomina$")
	public void selecciono_la_opcion_para_pago_de_nomina() throws Throwable {
	   
		svemenuobject.pagonomina();
	    
	}

	@When("^Ingreso la informacion basica del pago$")
	public void ingreso_la_informacion_basica_del_pago(DataTable dtDatosFor) throws Throwable {
	  
	     List<List<String>> data = dtDatosFor.raw();
        
        for (int i=1; i<data.size(); i++){

        	svesalidationsteps.diligenciar_datos_pago(data, i);
        }
		
	}

	@When("^Realizo la carga del lote$")
	public void realizo_la_carga_del_lote() throws Throwable {
	   
	    
	}

	@When("^Verifico el proceso del pago por SVE$")
	public void verifico_el_proceso_del_pago_por_SVE() throws Throwable {
	    
		
	}

	@Then("^Entro a tabla ARHIS$")
	public void entro_a_tabla_ARHIS() throws Throwable {
	   
	   
	}

	@Then("^Verifico pago exitoso$")
	public void verifico_pago_exitoso() throws Throwable {
	    
	   
	}

}

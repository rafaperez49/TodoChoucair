package com.choucair.formacion.definition;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.ListableBeanFactory;

import com.choucair.formacion.pageobjects.colorlibForValidationsPopupsPage;
import com.choucair.formacion.steps.colorLibColeccionStep;
import com.choucair.formacion.steps.colorLibRecorrerTablaStep;
import com.choucair.formacion.steps.colorlibValidationsStep;
import com.choucair.formacion.steps.popupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class PopupValidationDefinition {
	
	
	@Steps
	popupValidationSteps popupValidationSteps;
	@Steps
	colorlibValidationsStep elColorlibValidationStep;
	@Steps
	colorLibRecorrerTablaStep elColorLibRecorrerTablaSteps;
	@Steps colorLibColeccionStep elColorLibColeccionStep;
	
	@Given("^Autentico colorlib con usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
	public void autentico_colorlib_con_usuario_y_password(String usuario, String password) {
		popupValidationSteps.login_ColorLib(usuario, password);
		 
	}

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void Ingreso_a_la_funcionalidad_Forms_Validation() {
		popupValidationSteps.ingresar_form_validation();
	}
	
	@Given("^ingreso a la funcionalidad Tables$")
	public void ingreso_a_la_funcionalidad_Tables() {
		elColorLibRecorrerTablaSteps.ingresar_Tables_Form();
		
	}
	
	@When("^Diligencio formulario Popup Validation$")
	public void Diligencio_formulario_Popup_Validation(DataTable dDatosForm) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<List<String>> datos=dDatosForm.raw();
		 for (int i = 1; i < datos.size(); i++) 
		 { elColorlibValidationStep.diligenciarFormulario(datos, i);
		 	try {Thread.sleep(5000);			
		 	} catch (InterruptedException e) {
			
		 			}
		 }
    }
	
	@When("^Recorro la tabla$")
	public void recorro_la_tabla(){
		elColorLibRecorrerTablaSteps.recorrer_la_Tabla();
	}

	@When("^ingreso a la opcion llamada \"([^\"]*)\"$")
	public void ingreso_a_la_opcion_llamada(String nombreOpcion) throws InterruptedException {
		elColorLibColeccionStep.ingresarAMenu(nombreOpcion);
		
	}
	
	@When("^presionar los clicks$")
	public void presionar_los_clicks() throws Throwable {
		elColorLibColeccionStep.clickearMenus();
	}
	
	@Then("^Verifico ingreso exitoso$")
	public void Verifico_ingreso_exitoso() {
		elColorlibValidationStep.verificar_formulario_exitoso();
	}
	
	@Then("^Verificar que se presente un globo informativo$")
	public void verificar_que_se_presente_un_globo_informativo() throws Throwable {
		elColorlibValidationStep.verificar_formulario_con_error();
	}
	

}

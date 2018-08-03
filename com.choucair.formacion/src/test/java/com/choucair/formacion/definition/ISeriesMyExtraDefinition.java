package com.choucair.formacion.definition;

import java.io.FileReader;
import java.util.Properties;

import com.choucair.formacion.steps.ISeriesMyExtraSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ISeriesMyExtraDefinition {
	
	private String user;
	private String password;
	@Steps
	ISeriesMyExtraSteps iseriesMyExtraSteps;
	
	@Given("^Abrir my extra \"([^\"]*)\"$")
	public void abrir_MyExtra(String rutaCalidad) throws Throwable {
	iseriesMyExtraSteps.Abrir_Extra(rutaCalidad);
	}
	
	@When("^Autenticar MyExtra$")
	public void autenticar_MyExtra() throws Throwable {
	Properties prop = new Properties();
	prop.load(new FileReader("C:/Users/rperezr/Downloads/com.choucair.base/com.choucair.base/dbConfig.properties"));
	this.user = prop.getProperty("db.user");
	this.password = prop.getProperty("db.password");
	iseriesMyExtraSteps.Autenticar_Extra(user, password);
	}
	
	@Given("^Ingresar a un menu segun \"([^\"]*)\"$")
	public void ingresar_a_un_menu_segun(String tipoCodigo) throws Throwable {
		iseriesMyExtraSteps.Ingresar_A_Un_Menu(tipoCodigo);
	}
	

}

package com.choucair.formacion.pageobjects;

import net.bytebuddy.asm.Advice.This;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")

public class colorLibLoginPage extends PageObject{

	//CampoUsuario
	@FindBy(xpath="//*[@id='login']/form/input[1]")
	public static WebElementFacade txtUserName;
	
	@FindBy(xpath="//*[@id=\'login\']/form/input[2]")
	public static WebElementFacade txtPassword;
	
	@FindBy (xpath="//*[@id=\'login\']/form/button")
	public static WebElementFacade botonLogueo;
	
	@FindBy (xpath="//*[@id=\'bootstrap-admin-template\']")
	public static WebElementFacade labelInicio;
	
	private String usuario;
	private String password;
	
	
	public void insertarDatos(String usuario, String password)
	{
		this.usuario=usuario;
		this.password=password;
		txtUserName.sendKeys(usuario);
		txtPassword.sendKeys(password);
		botonLogueo.click();
	}

	public static void verificarHome() {
		
		String labelv="Bootstrap-Admin-Template";
		String strMensaje= labelInicio.getText();
		assertThat(strMensaje, containsString(labelv));
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

package com.choucair.formacion.steps;

import java.io.IOException;
import java.net.MalformedURLException;

import com.choucair.formacion.pageobjects.winiumReportePage;

import net.thucydides.core.annotations.Step;
import utilities.utilidadesEvidencias;

public class winiumReporteSteps {
	
	winiumReportePage elWiniumReportePage;

	@Step
	public void abreLaAplicacion(String elPrograma, String rutaWinium) throws Exception {
		elWiniumReportePage.abrirApp(elPrograma, rutaWinium);
		
	}
	@Step
	public void autentica() {
		
		elWiniumReportePage.autenticacion();
	}
	
	@Step
	public void verificaIngresoFallido(String rutaEvidencia) throws Throwable {
		
		utilidadesEvidencias.tomascreenshot(rutaEvidencia);
		elWiniumReportePage.open();
		
		utilidadesEvidencias.tomaevidencia();
		
		//Runtime.getRuntime().exec( "start chrome file:///D:/exito/evidencia.png");
		
		//Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome file:///"+rutaEvidencia});
		utilidadesEvidencias.minimizar();
		Runtime.getRuntime().exec("taskkill /f /pid chromedriver.exe",null);
		Runtime.getRuntime().exec("taskkill /f /pid chrome.exe",null);
		
	}
	
	
	
	

}

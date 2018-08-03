package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.SveObjectsInfoPago;

import net.thucydides.core.annotations.Step;

public class SveValidationSteps {
	
	SveObjectsInfoPago sveobjectsinfoPago;
	
	@Step
	public void diligenciar_datos_pago(List<List<String>> data, int id) throws InterruptedException{
		
		sveobjectsinfoPago.saltarFrame();
		sveobjectsinfoPago.Tipopago(data.get(id).get(0).trim());
		Thread.sleep(5000);
		sveobjectsinfoPago.Modelo(data.get(id).get(1).trim());
		sveobjectsinfoPago.Nombre(data.get(id).get(2).trim());
		sveobjectsinfoPago.Cuenta(data.get(id).get(3).trim());
		sveobjectsinfoPago.Aplicacion(data.get(id).get(4).trim());
		sveobjectsinfoPago.Fecha(data.get(id).get(5).trim());
		
		sveobjectsinfoPago.Continuar();
	
	}
	
	@Step
	public void verificar_ingreso_exitoso() {
		sveobjectsinfoPago.Ingreso_sin_errores();
	}
	
	@Step
	public void verificar_ingreso_con_errores() {
		sveobjectsinfoPago.Ingreso_con_errores();
	}
	
	
}




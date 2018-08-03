package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.Ubicarmeinpage;

import net.thucydides.core.annotations.Step;

public class UbicarmeSteps {
	
	Ubicarmeinpage ubicarmeinpage;
	
	@Step
	
	public void AbrirPagina() {
	
	ubicarmeinpage.open();
	
	
	
	
	}	

}

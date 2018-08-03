package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject{
	
	@FindBy (xpath="//*[@id=\'menu\']/li[6]/a/span[1]")
	public WebElement menuForms;
	
	@FindBy (xpath="//*[@id=\'menu\']/li[7]/a")
	public WebElement menuTablesForm;
	
	
	@FindBy (xpath="//*[@id=\'menu\']/li[6]/ul/li[2]/a")
	public WebElement menuFormsValidation;
	
	@FindBy (xpath="//*[@id=\'menu\']/li[6]/ul/li[1]/a")
	public WebElement menuFormsGeneral;
	
	@FindBy (xpath="//*[@id=\'content\']/div/div/div[1]/div/div/header/h5")
	public WebElement lblFormsValidation;
	
	public void menuFormsValidation()
	{
		menuForms.click();
		menuFormsValidation.click();
		String strMensaje= lblFormsValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));
	}
	
	public void menuTablesForm()
	{
		menuTablesForm.click();		
	}
	
}

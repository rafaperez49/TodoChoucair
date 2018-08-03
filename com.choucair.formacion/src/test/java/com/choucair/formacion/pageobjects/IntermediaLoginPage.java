package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@DefaultUrl("http://10.8.69.182:18888/intermedia/index.jsp")

public class IntermediaLoginPage extends PageObject{
	
	/*WebElement txtUsername = getDriver().findElement(By.name("USER"));	
	WebElement txtPassword = getDriver().findElement(By.name("PASSWORD"));*/
	 	
	//Campo usuario 	
		@FindBy(name="USER")
		public WebElementFacade txtUsername;
	//Campo Password
		@FindBy(name="PASSWORD")
		public WebElementFacade txtPassword;
		
	//Boton Ingresar
		@FindBy(name="botingresar")
		public WebElementFacade btnSignIn;
		
			
	//Label del home a verificar //*[@id="bienvenida"] //*[@id="navBarSup"] //*[@id="Entidades"]/a
		//@FindBy(xpath="//*[@id='navBarSup']")
		@FindBy(id="bienvenida")
		public WebElementFacade HomePpal;
		
		
	
		public void IngresarDatos(String usuario,String password) 
		{
			txtUsername.sendKeys(usuario);
			txtPassword.sendKeys(password);
		
		//	btnSignIn.click();
			
			
		}
		
		
		
			
		public void VerificarHome_correct() 
		{			
			 try{
			        if(HomePpal.isVisible()){
			          System.out.println("Element is Visible");
			        }
			}
			catch(NoSuchElementException e){
			   
			     System.out.println("Element is InVisible");
			        
			}
								
		}
		
}

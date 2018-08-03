package com.choucair.formacion;
import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.serenitybdd.core.annotations.findby.By;


public class loginSVE{
	
	public void clave(String StrClave) {

		//Asigno la url de prueba.
		String UrlSVE = "https://bolebc4.qa.todo1.com/SVE/control/BoleTransactional.bancolombia";                             
        //Asigno la propiedad del webdrive donde esta ubicado mi Driver de chrome o a usar.
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\com.choucair.base\\src\\test\\resources\\driver\\chromedriver.exe");
        //creo un objeto WebDriver del nuevo manejador con base en el driver de la url.
		WebDriver oWebDriver = new ChromeDriver();
		//entro a la url de SVE
        oWebDriver.get(UrlSVE);
		
        //damos Clic en la clave para escribir sobre este elemento de lo contrario el js no me escribe.
        oWebDriver.findElement(By.id("USERPASS")).click();
        
        //declaro un objjeto javascript para la ejecucion del teclado.
		JavascriptExecutor js = (JavascriptExecutor)oWebDriver;  
		
		//declaro una varaible entero para convertir cada digito en un entero y controlarlo por error.
		int DigitoNumeric = 0;
		
		for (int i = 0; i < StrClave.length(); i++) {
			String DigitoClave = StrClave.substring(i, i+1).toUpperCase();
			try
	         {
				DigitoNumeric = Integer.parseInt(DigitoClave);
				System.out.println("Entro Numero: " + DigitoClave);
				js.executeScript("writeNumeric('" + DigitoNumeric + "');");
	         }
	         catch(Exception e)
	         {
	        	 System.out.println("Entro Alfabetico: " + DigitoClave);
	        	 js.executeScript("writeAlpha('" + DigitoClave + "');");
	         }
		}	
	}	
}

package com.choucair.formacion.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class colorLibRecorrerTablaPage extends PageObject{
	
		
	@FindBy (id="dataTable")
	public WebElement laDataTable;
	
	public void recorrerTabla()
	{
		List<WebElement> lasFilasTabla=laDataTable.findElements(By.xpath("//*[@id=\'dataTable\']/tbody/tr"));
		int numeroDeFilas=lasFilasTabla.size();
		int numeroDeColumnas;
		
		
		for (int i = 1; i <= numeroDeFilas; i++) 
		{
			List<WebElement> lasColumnasTabla=laDataTable.findElements(By.xpath("//*[@id=\'dataTable\']/tbody/tr["+i+"]/td"));
			numeroDeColumnas=lasColumnasTabla.size();
			for (int j = 1; j <= numeroDeColumnas; j++) 
			{
				String elDato=laDataTable.findElement(By.xpath("//*[@id='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(elDato);
			}
			
		}
		
		
	}

}

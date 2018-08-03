package com.choucair.formacion.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class SveMenuObject extends PageObject{
	 
	 //Verifico Ingreso Pago Manual
	
    @FindBy (xpath = "//*[@id='forma']/table/tbody/tr[5]/td[3]")
    public WebElementFacade lblpagomanual;
	

 	public void pagonomina() throws InterruptedException, AWTException{
 		Thread.sleep(20000);
 		
 		Robot robot = new Robot();
		robot.mouseMove(389,210);
		Thread.sleep(1000);
		robot.mouseMove(419,265);
		Thread.sleep(1000);
		robot.mouseMove(620,285);
		Thread.sleep(1000);
		robot.mousePress(MouseEvent.BUTTON1_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_MASK);
		Thread.sleep(15000);
 		 
 	}

 
 	
 	
 	}






package com.choucair.formacion.pageobjects;

import myextra._Session;
import myextra._System;
import net.serenitybdd.core.pages.PageObject;
import utilities.ProcessUtility;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.io.IOException;

import myextra.MyExtra_init;
import myextra.Screen;

public class ISeriesMyExtraPage extends PageObject{
	public _System sSystem=null;
	public Screen Screen=null;
	public _Session Sess0=null;
	public int g_HostSettleTime = 3000; // milisegundos
	
	public void iniciar_Extra(String rutaCalidad) throws InterruptedException
	{	try
		{
			if(ProcessUtility.isProcessRunning("EXTRA.exe"))
				MyExtra_init.cerrarMyExtraAbierto();
			MyExtra_init.abrirArchivoDeMyExtra(rutaCalidad);
			Thread.sleep(5000);
			sSystem= MyExtra_init.crearSistema();
			Sess0=MyExtra_init.crearSesion(sSystem);
			Screen=MyExtra_init.crearPantalla(Sess0);
			sSystem.timeoutValue(g_HostSettleTime);
		}catch (IOException e) {
	// TODO Auto-generated catch block
				e.printStackTrace();
	}
	}
	
	
	public void Autenticar_Extra(String strUsuario, String strClave) {
		try {
			String TextoPantalla = "";
			Screen.putString(strUsuario, 6, 53, null);
			Screen.putString(strClave, 7, 53, null);
			Screen.sendKeys("<Enter>");
			Screen.waitHostQuiet(g_HostSettleTime);
			Thread.sleep(2000);
			TextoPantalla = Screen.getString(24, 1, 49, Screen); //capturar texto validación de clave
			assertThat(TextoPantalla, is(not("La información de inicio de sesión no es correcta")));
			int i = 0;
			while(true)
			{	i++;
			    //verifica label para identificar si se logró la autenticación exitosa
				Thread.sleep(2000);
				TextoPantalla = Screen.getString(5, 7, 9, Screen);
				if (!TextoPantalla.equals("Ubicarse:")){
					Screen.sendKeys("<Enter>");
					Screen.waitHostQuiet(g_HostSettleTime);
				} else { break; }
				if (i==5) { break;}
			}
			assertThat(TextoPantalla,is("Ubicarse:"));
			} catch (Exception e) {
		// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				}
		}

	public void seleccionarUnMenu(String tipoDato)
	{
		if (tipoDato.equals("AIP"))
			Screen.putString("1", 8, 10, null);
		else
			if( tipoDato.equals("S"))
				Screen.putString("1", 9, 10, null);
			else
				if(tipoDato.equals("W"))
					Screen.putString("1", 10, 10, null);
				else
					if(tipoDato.equals("Y"))
						Screen.putString("1", 11, 10, null);
		Screen.sendKeys("<Enter>");
		Screen.waitHostQuiet(g_HostSettleTime);
				
	}
	

}



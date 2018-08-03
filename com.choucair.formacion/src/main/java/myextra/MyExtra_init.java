package myextra;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class MyExtra_init 
{
	
	
	
	
	public boolean seCreoElSistema(_System elSistema)
	{
		if(elSistema==null)
			return false;
		else
			return true;
	}
	
	public static void cerrarMyExtraAbierto()
	{
		_System s=ClassFactory.createExtraSystem();
		_Session sesion= s.activeSession();
		sesion.closeEx(1);
		
	}
	
	public static void destroyProceso() throws IOException
	{
		Runtime rt = Runtime.getRuntime();
		rt.exec("taskkill /F /IM EXTRA.exe");
	}
	
	public static void abrirArchivoDeMyExtra(String laRutaDelArchivo) throws IOException
	{
		Desktop  desk =Desktop.getDesktop();
		File file = new File(laRutaDelArchivo);
		desk.open(file);
	}
	
	public static _System crearSistema()
	{
		return ClassFactory.createExtraSystem();		
		
	}
	
	public static _Session crearSesion(_System elSistema)
	{
		return elSistema.activeSession();
	}
	
	public static Screen crearPantalla(_Session laSesion)
	{
		return laSesion.screen();
	}
	
}

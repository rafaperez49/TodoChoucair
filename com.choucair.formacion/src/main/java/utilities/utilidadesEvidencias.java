package utilities;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class utilidadesEvidencias {
	
	
	public static WiniumDriver driver = null;
	private static final String TASKLIST = "tasklist";
	private static final String KILL = "taskkill /F /IM ";
	public static WiniumDriver Eldriver;
	static WiniumDriverService service=null;
	
	
	public static boolean isProcessRunning(String serviceName) throws Exception {

		 Process p = Runtime.getRuntime().exec(TASKLIST);
		 BufferedReader reader = new BufferedReader(new InputStreamReader(
		   p.getInputStream()));
		 String line;
		 while ((line = reader.readLine()) != null) {

		  System.out.println(line);
		  if (line.contains(serviceName)) {
		   return true;
		  }
		 }

		 return false;

		}
	
	public static void abrirProgramaN(String ruta, String rutaPrograma) throws Exception
	{
		
		if (isProcessRunning("Winium.Desktop.Driver.exe"))
			  killProcess("Winium.Desktop.Driver.exe");        
		
		
		 DesktopOptions option = new DesktopOptions();
		 
		 option.setApplicationPath(rutaPrograma);
		 
		 option.setDebugConnectToRunningApp(false);
		 
		 option.setLaunchDelay(2);
		 
		 File driverPath = new File(ruta);  
	     service =new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(false).withSilent(false).buildDesktopService();
	     Thread.sleep(2000);
	     service.start();
	     Thread.sleep(5000);
	     driver = new WiniumDriver(service,option);
	     Thread.sleep(5000);
	        
	}
	
	
	public static void  iniciarProgramaConWinium() throws Exception
	{
		if (isProcessRunning("Winium.Desktop.Driver.exe"))
			  killProcess("Winium.Desktop.Driver.exe"); 
		
	}
	
	public static void killProcess(String serviceName) throws Exception {

		  Runtime.getRuntime().exec(KILL + serviceName);

		 }
	
	public static void tomaevidencia() {
		//		waitFor(1).seconds();
		Serenity.takeScreenshot();
	
	}
	
	public static void tomascreenshot(String rutaEvidencia) throws Throwable {
		
		//waitFor(1).seconds();
		Robot robot = new Robot();           
        BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(screenShot, "PNG", new File(rutaEvidencia));
      
	}
	
	public static void minimizar() {
		WebElement window =  driver.findElementByClassName("Chrome_WidgetWin_1");
		window.findElement(By.name("Minimizar")).click();		
	}
	
	
	public static void tomaevidenciaOculta(PageObject winiumPage, String rutaImagen) throws Throwable 
	{	
		winiumPage.open();
		tomaevidencia();
		//Ejecuta el proceso deseado
		Runtime.getRuntime().exec( "start chrome file:///"+rutaImagen+'"');
		//Ejecuta el comando en proceso separado
		Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome file:///"+rutaImagen+'"'});		
		minimizar();
		Runtime.getRuntime().exec("taskkill /f /pid chromedriver.exe",null);
		Runtime.getRuntime().exec("taskkill /f /pid chrome.exe",null);
	}
	
	
	public static void ejecutarPrograma(String elPrograma) throws MalformedURLException
	{
		DesktopOptions option = new DesktopOptions();
		Eldriver = new WiniumDriver(new URL("http://localhost:9999"),option);
		option.setApplicationPath(elPrograma);
		
	}
	
	

}

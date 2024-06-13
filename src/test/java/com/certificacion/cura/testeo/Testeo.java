package com.certificacion.cura.testeo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.certificacion.cura.test.Login;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Testeo {

	WebDriver driver;
	Login login;
	@Before
	public void iniciar()
	{System.setProperty("Webdriver.chrome.driver", "C:\\Users\\1583715\\Desktop\\Selenium");
	//Incognito
	//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//incognito
	//ChromeOptions options = new ChromeOptions();
	//indognito
	//options.addArguments("incognito");
	//imcognito
	//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	
	driver = new ChromeDriver();
    //js = (JavascriptExecutor) driver;
	driver.get("https://katalon-demo-cura.herokuapp.com");
	login = new Login(driver);
	}
	
	@Test
	public void validarAccionesKatalon()
	{
		//System.out.println(login.capturarClave());
		//driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		
	

	}
	
	@After
	public void cerrar()
	{
		driver.close();
	}
}

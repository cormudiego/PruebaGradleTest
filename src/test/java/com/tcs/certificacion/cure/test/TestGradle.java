package com.tcs.certificacion.cure.test;

import static org.junit.Assert.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tcs.certificacion.cure.pages.AppointmentConfirmation;
import com.tcs.certificacion.cure.pages.Login;
import com.tcs.certificacion.cure.pages.MakeAppointment;

public class TestGradle {
	WebDriver driver;
	Login login;
	MakeAppointment makeappointment;
	AppointmentConfirmation appointmentConfirmation;

	@Before
	public void iniciar() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Diego\\Desktop\\chromedriver\\chromedriver.exe");

		 //incognito
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized","--disable-infobars","--incognito","--always-authorize-plugins","--disable-web-security","--allow-running-insecure-content","--ignore-certificate-errors");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		// js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com");
		login = new Login(driver);
		makeappointment = new MakeAppointment(driver);
		appointmentConfirmation = new AppointmentConfirmation(driver);

	}

	@Test
	public void validarAccionesKatalon() throws InterruptedException {

		// driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		// login.clickLogin();

		login.clickbtnMkeAppointment();
		login.ingresarUsuario(login.capturaUsuario());
		login.ingresarClave(login.capturarClave());
		login.clickLogin();
		assertEquals("Make Appointment", makeappointment.textoMarketAppointment());
		//login.clickFacility();
        //login.selectFacility(2);
		makeappointment.selectFacility("Seoul CURA Healthcare Center");
		makeappointment.checkApplyForHospital();
		makeappointment.checkRbtHealthcare();
		makeappointment.clickDtVisitDate();
		makeappointment.clickbtnBookAppointment();
		
		
		while(!makeappointment.textolblAnoMes().equals("July 2024"))
		{
			makeappointment.clickBtnNext();
		}
		
		makeappointment.selectDay(10); 
		makeappointment.EscribirComment("Hola mundo");
		makeappointment.clickbtnBookAppointment();
		
		assertEquals("Appointment Confirmation", appointmentConfirmation.textoAppointmentConfirmation());

	}

	@After
	public void cerrar() {
		driver.close();
	}

}

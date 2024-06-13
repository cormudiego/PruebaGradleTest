package com.google.certificacion.cura.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import net.serenitybdd.core.annotations.findby.FindBy;

public class Login {
	
	@FindBy(id="btn-make-appointment")
	private WebElement btnMkeAppointment;
	
	@FindBy(xpath="//input[@placeholder='Username' and @readonly]")
	private WebElement txtDemoUser;
	
	@FindBy(xpath="//input[@placeholder='Password' and @readonly]")
	private WebElement txtDemoPassword;
	
	@FindBy(xpath="//input[@class='form-control' and @id='txt-username']")
	private WebElement txtDemoUserName;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement btnLogin;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickbtnMkeAppointment()
	{
		btnMkeAppointment.click();
	}
	
	public String capturaUsuario()
	{
		return txtDemoUser.getAttribute("value");
	}
	
	public String capturarClave()
	{
		return txtDemoPassword.getAttribute("value");
	}
	
	public void ingresarUsuario(String usuario)
	{
		txtDemoUserName.sendKeys(usuario);
	}
	
	
	public void ingresarClave(String clave)
	{
		txtDemoUserName.sendKeys(clave);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	

}

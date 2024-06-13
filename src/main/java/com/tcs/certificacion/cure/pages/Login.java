package com.tcs.certificacion.cure.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login {

	@FindBy(id = "btn-make-appointment")
	private WebElement btnMkeAppointment;

	@FindBy(xpath = "//input[@placeholder='Username' and @readonly]")
	private WebElement txtDemoUser;

	@FindBy(xpath = "//input[@placeholder='Password' and @readonly]")
	private WebElement txtDemoPassword;

	@FindBy(xpath = "//input[@class='form-control' and @id='txt-username']")
	private WebElement txtDemoUserName;

	@FindBy(xpath = "//input[@class='form-control' and @id='txt-password']")
	private WebElement txtDemoPasswordName;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	private WebElement btnLogin;

	@FindBy(id = "combo_facility")
	private WebElement btnFacility;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickbtnMkeAppointment() {
		this.btnMkeAppointment.click();
	}

	public String capturaUsuario() {
		return this.txtDemoUser.getAttribute("value");
	}

	public String capturarClave() {
		return this.txtDemoPassword.getAttribute("value");
	}

	public void ingresarUsuario(String usuario) {
		this.txtDemoUserName.sendKeys(usuario);
	}

	public void ingresarClave(String clave) {
		this.txtDemoPasswordName.sendKeys(clave);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void clickFacility() {
		btnFacility.click();
	}

}

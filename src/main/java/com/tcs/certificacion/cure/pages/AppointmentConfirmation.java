package com.tcs.certificacion.cure.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentConfirmation {

	@FindBy(xpath="//div[@class='col-xs-12 text-center']//h2")
	private WebElement lblAppConfirmation;
	
	public AppointmentConfirmation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String textoAppointmentConfirmation()
	{
		return lblAppConfirmation.getText();
	}
}

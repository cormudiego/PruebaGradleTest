package com.tcs.certificacion.cure.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointment {
	@FindBy(xpath = "//div[@class='col-sm-12 text-center']//h2")
	private WebElement lblMarketAppointment;
	@FindBy(id = "combo_facility")
	private WebElement Select;
	// private List<WebElement> slsFacility;	
	@FindBy(id="chk_hospotal_readmission")
	private WebElement chkApplyForHospital;
	@FindBy(id="radio_program_medicaid")
	private WebElement rbtHealthcare;
	@FindBy(xpath="//span[@class='glyphicon glyphicon-calendar']")
	private WebElement dtVisitDate;
	@FindBy(xpath="//div[@class='datepicker-days']//th[@class='datepicker-switch']")
	private WebElement lblAnoMes;
	@FindBy(xpath="//div[@class='datepicker-days']//th[@class='next']")
	private WebElement btnNext;
//	@FindBy(xpath="//div[@class='datepicker-days']//td[@class='day']")
//	private WebElement btnDay;
	@FindBy(xpath = "//div[@class='datepicker-days']//td[@class='day']")
	private List<WebElement> SelectDay;
	@FindBy(xpath="//textarea[@class='form-control']")
	private WebElement txtComment;
	@FindBy(id="btn-book-appointment")
	private WebElement btnBookAppointment;
	
    public MakeAppointment(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	public String textoMarketAppointment() {
		return lblMarketAppointment.getText();
	} 
	
	// Otra manera de seleccionar uns opcion de una lista
	public void selectFacility(String optionFacility) {
		Select list = new Select(Select);
		list.selectByVisibleText(optionFacility);
	}
	
	public void checkApplyForHospital()
	{
		chkApplyForHospital.click();
	}
	
	public void checkRbtHealthcare()
	{
		rbtHealthcare.click();
	}
	
	public void clickDtVisitDate()
	{
		dtVisitDate.click();
	}
	
	public String textolblAnoMes()
	{
		return lblAnoMes.getText();
	}
	
	public void clickBtnNext()
	{
		btnNext.click();
	}
	
//	public void clickBtnDay()
//	{
//		btnDay.click();
//	}
	
	public void selectDay(int day) {	
	 SelectDay.get(day-1).click();
	}
	
	public void EscribirComment(String comment)
	{
		txtComment.sendKeys(comment);
	}
	
	public void clickbtnBookAppointment()
	{
		btnBookAppointment.click();
	}

	// Seleccionar un elemento de una lista enviandole el indice
	/*
	 * public void selectFacility(int IndexOption) {
	 * slsFacility.get(IndexOption).sendKeys(Keys.ENTER); }
	 */
}

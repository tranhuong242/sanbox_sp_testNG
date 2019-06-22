package senpay.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class pTopup {

	public pTopup() {
		// TODO Auto-generated constructor stub
	}
	
	public static WebElement menu_Topup=constant.driver.findElement(By.cssSelector("#MainContent_TransMenu1_hlTopUp")); 
	public static WebElement icon_Debit_visa=constant.driver.findElement(By.xpath("//label[@id='internal-img-bank-17']//img[@src='/Contents/Imgs/logovisa.gif']"));
	public static WebElement txt_amount=constant.driver.findElement(By.cssSelector("#txtAmount_Internal"));
	public static WebElement txt_OTP=constant.driver.findElement(By.cssSelector("#MainContent_txtXacMinhOTP")); 
	public static WebElement txt_Debit_CardName=constant.driver.findElement(By.cssSelector("#MainContent_Default1_ctl00_txtCardName")); 
	public static WebElement txt_Debit_CardNumber=constant.driver.findElement(By.cssSelector("MainContent_Default1_ctl00_txtCardNumber")); 
	public static WebElement txt_Debit_CardMonth=constant.driver.findElement(By.cssSelector("#MainContent_Default1_ctl00_ddlMonthList"));
	public static WebElement txt_Debit_CardYear=constant.driver.findElement(By.cssSelector("#MainContent_Default1_ctl00_ddlYearList"));
	public static WebElement txt_Debit_CardCVV=constant.driver.findElement(By.cssSelector("#MainContent_Default1_ctl00_txtCCV"));
	public static WebElement btn_Debit_Agree=constant.driver.findElement(By.cssSelector("#MainContent_Default1_ctl00_btnAgree"));
	
}

package senpay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pLogInPage {
	public static WebElement txt_phoneNumber = constant.driver.findElement(By.xpath("//div[@class='phone-field']//*[text()='Số điện thoại di động']/following-sibling::input"));
	
	public static WebElement btn_Next1 = constant.driver.findElement(By.xpath("//button[@type='submit']"));
	

	public pLogInPage() {
		// TODO Auto-generated constructor stub
	}

}

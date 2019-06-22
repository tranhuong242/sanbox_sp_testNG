package senpay.models;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import senpay.pages.constant;
import senpay.pages.pHomePage;
import senpay.pages.pLogInPage;
import senpay.pages.pWithdrawPage;

public class mLogIn {

	public mLogIn() {
		
		
	}
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", 
	               constant.PATHCHROME);
	constant.driver=new ChromeDriver();
	constant.driver.get(constant.URL);
	}
	
	public void inputPhone(String phone ){
		pHomePage.loginLink.click();
		
		pLogInPage.txt_phoneNumber.sendKeys(phone);
		pLogInPage.btn_Next1.click();
		}
	public void inputPincode(String pin){
		
		WebElement txt_PinCode =
				constant.driver.findElement(By.xpath("//div[@class='pincode-field']//*[contains(text(),'Pin Code')]/following-sibling::input"));
		txt_PinCode.sendKeys(pin);
				WebElement btn_Next2 = constant.driver.findElement(By.xpath("//button[@type='submit']"));
			
		
	//	WebElement txt_PinCode = constant.driver.findElement(By.xpath("//div[@class='pincode-field']//*[contains(text(),'Pin Code')]/following-sibling::input"));
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(constant.driver);
		wait.withTimeout(30000, TimeUnit.SECONDS);
		wait.pollingEvery(250, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);		
		wait.until(ExpectedConditions.elementSelectionStateToBe(txt_PinCode, true));
		
		txt_PinCode.sendKeys(pin);
		
		/*if (txt_PinCode.isEnabled() ==true){
			txt_PinCode.click();
			txt_PinCode.sendKeys(pin);
			
		}
		else{
			Actions action = new Actions(constant.driver);
	        action.sendKeys(Keys.RETURN);
	        action.perform();

			txt_PinCode.sendKeys(pin);
			
			
		}
*/		
	}

}

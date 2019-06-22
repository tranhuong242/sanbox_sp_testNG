package senpay.models;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;


import senpay.pages.constant;
import senpay.pages.pWithdrawPage;

public class mWithdraw {

	public mWithdraw() {
		// TODO Auto-generated constructor stub
	}

	public void withdraw(String bank,String amount,String pass, String Msg_Expected_Result) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(constant.driver);
		wait.withTimeout(30000, TimeUnit.SECONDS);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		 wait.until(ExpectedConditions.elementToBeClickable(pWithdrawPage.menu_Trans));
		

		pWithdrawPage.menu_Trans.click();
		
		FluentWait<WebDriver> wait2 = new FluentWait<WebDriver>(constant.driver);
		wait2.withTimeout(30000, TimeUnit.SECONDS);
		wait2.pollingEvery(5, TimeUnit.SECONDS);
		wait2.ignoring(NoSuchElementException.class);
		 wait2.until(ExpectedConditions.elementToBeClickable(pWithdrawPage.menu_Withdraw));
		
		pWithdrawPage.menu_Withdraw.click();
		Select oSelect = new Select(pWithdrawPage.combo_Bank);
		oSelect.selectByValue(bank);
		pWithdrawPage.txt_Amount.sendKeys(amount);
		pWithdrawPage.btn_Next1.click();
		pWithdrawPage.txt_PassTrans.sendKeys(pass);
		pWithdrawPage.btn_Next2.click();
		
		if (pWithdrawPage.msg_Actual_Result.equals(Msg_Expected_Result)){
			//ghi pass vao file excel.
		}

	}

}

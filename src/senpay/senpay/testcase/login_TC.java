package senpay.senpay.testcase;

import org.testng.annotations.Test;

import senpay.models.mLogIn;
import senpay.models.mWithdraw;
import senpay.pages.ExcelUtility;
import senpay.pages.constant;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class login_TC {
	mLogIn lg = new mLogIn();
	mWithdraw wth=new mWithdraw();
	ExcelUtility ex = new ExcelUtility();
	
	
  @Test
  public void f() {
	  ex.setExcelFile(constant.PATH_TestData, constant.FILE_TestData);
	  
	  
	  lg.inputPhone(ExcelUtility.getCellData(1, 0));
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  lg.inputPincode(ExcelUtility.getCellData(1, 1));
	  wth.withdraw("","","","");
	  
  }
  @BeforeSuite
  public void beforeSuite() {
	  lg.openBrowser();
	  
  }

  @AfterSuite
  public void afterSuite() {
  }

}

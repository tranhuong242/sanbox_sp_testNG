package senpay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pWithdrawPage {

	public pWithdrawPage() {
		// TODO Auto-generated constructor stub
	}
	public static WebElement menu_Trans=constant.driver.findElement(By.xpath("//div[@class='nav_top']//ul//li[@id='MainMenu_liTrans']"));
	public static WebElement menu_Withdraw=constant.driver.findElement(By.cssSelector("#MainContent_TransMenu1_hlPayWithDraw"));
	public static WebElement combo_Bank=constant.driver.findElement(By.cssSelector("#MainContent_ddlBank"));
	public static WebElement txt_Amount=constant.driver.findElement(By.cssSelector("#MainContent_txtAmount"));
	public static WebElement btn_Next1=constant.driver.findElement(By.cssSelector("#MainContent_btStep1"));
	public static WebElement label_BeforeAmount=constant.driver.findElement(By.cssSelector("..."));//verify money
	public static WebElement label_AfterAmount=constant.driver.findElement(By.cssSelector("..."));//verify money
	public static WebElement txt_PassTrans=constant.driver.findElement(By.cssSelector("#MainContent_txtXacMinhOTPGiaoDich"));
	public static WebElement btn_Next2=constant.driver.findElement(By.cssSelector("#MainContent_btStep2"));	
	public static WebElement msg_Actual_Result=constant.driver.findElement(By.cssSelector(""));
}

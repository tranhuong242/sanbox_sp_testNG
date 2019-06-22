package senpay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pTransfer {

	public pTransfer() {
		// TODO Auto-generated constructor stub
	}
	public static WebElement menu_Trans= constant.driver.findElement(By.cssSelector(""));
	public static WebElement menu_Transfer=constant.driver.findElement(By.cssSelector("#MainContent_TransMenu1_hlTransferMoney"));
	public static WebElement comb_ReceiverInfo_Type=constant.driver.findElement(By.cssSelector("#ddlAccountReceiver"));
	public static WebElement text_ReceiverInfo=constant.driver.findElement(By.cssSelector("#txtMaTkEmailDTNguoiNhan"));
	public static WebElement btn_Check=constant.driver.findElement(By.cssSelector("#MainContent_btnKtTaiKhoanNguoiNhan"));
	public static WebElement btn_Next=constant.driver.findElement(By.cssSelector("#MainContent_btnTiepTuc"));
	public static WebElement txt_Amount=constant.driver.findElement(By.cssSelector("#MainContent_txtSoTienChuyen"));
	public static WebElement txt_Transfer_Content=constant.driver.findElement(By.xpath("//textarea[@id='MainContent_txtNoiDungChuyenTien']"));
	public static WebElement comb_ChargeType=constant.driver.findElement(By.cssSelector("#MainContent_ddlPayCashTransferChargeType"));
	public static WebElement text_Capcha=constant.driver.findElement(By.cssSelector("#MainContent_txtMaXacNhan"));
	public static WebElement btn_Transfer=constant.driver.findElement(By.cssSelector("#MainContent_btnChuyenTien"));
	public static WebElement txt_Pass_Trans=constant.driver.findElement(By.cssSelector("#MainContent_txtXacMinhOTPGiaoDich"));
	public static WebElement btn_Transfer_Submit=constant.driver.findElement(By.cssSelector("#MainContent_btnXacMinhOTPGiaoDich"));
	
}

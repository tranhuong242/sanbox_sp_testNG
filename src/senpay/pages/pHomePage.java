package senpay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pHomePage {

	public pHomePage() {
		// TODO Auto-generated constructor stub
	}
	//public static WebElement loginLink= constant.driver.findElement(By.xpath(".//a[@id='btnLogin']"));
	public static WebElement loginLink= constant.driver.findElement(By.cssSelector("#btnLogin"));

}

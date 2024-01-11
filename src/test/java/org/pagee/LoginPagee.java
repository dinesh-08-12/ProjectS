package org.pagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class LoginPagee extends BaseClass{
   
	public  LoginPagee() {
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(id="email")
	private WebElement txtusername;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	
	
	
	
	
	
	
	
	// @findBy 
	
	// without  page factory 
//	public static WebElement txtusername() {
//		WebElement txtusername = driver.findElement(By.id("email"));
//		return txtusername;
//
//	}
//	
	
	
	
	
	
	
	
	
	
}

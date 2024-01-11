package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pagee.LoginPagee;
import org.test.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleFb extends BaseClass {

	public static void main(String[] args) {
		
		broswerLaunch("Chrome");
		urlLaunch("https://www.facebook.com/");
		impWait();
		
		LoginPagee l = new LoginPagee();
		
		sendKeys(l.getTxtusername(), "sangeetha");
		
		sendKeys(l.getTxtpassword(), "987654");
		
		
		driver.navigate().refresh();
		
		sendKeys(l.getTxtusername(), "xxxx");
		sendKeys(l.getTxtpassword(), "12345");
		
	
		
		// pom ..page object model
		// stale element reference 
		// locators .... webelement 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

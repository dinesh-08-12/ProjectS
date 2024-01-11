package org.test.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//BASECLASS,HELPER CLASS,UTILITY CLASS,FUNCTIONAL LIBRARY
public class BaseClass {

	//

	public static WebDriver driver;

	// public static void chromeLaunch() {
	//
	// WebDriverManager.chromedriver().setup();
	// driver=new ChromeDriver();
	//
	// }
	//

	public static WebDriver broswerLaunch(String broswername) {

		switch (broswername) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		}
		return driver;

	}

	public static void urlLaunch(String url) {
		driver.get(url);

	}

	public static void impWait() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	public static void sendKeys(WebElement e, String data) {
		e.sendKeys(data);

	}

	public static void click(WebElement e) {
		e.click();
	}

	public static String getCurrenUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");

	}

	// DRAG AND DROP
	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}

	public static void moveToElemetn(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();

	}

	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	// SELECT
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);

	}

	public static void screensot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);

		File to = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\" + filename + ".png");
		FileUtils.copyFile(from, to);

	}

	public static void jsSendkeys(WebElement e, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", e);

	}

	public static void intoFrames(int index) {
		driver.switchTo().frame(index);

	}

}

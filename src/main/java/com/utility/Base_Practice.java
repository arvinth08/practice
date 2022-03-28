package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Practice {

	public static WebDriver driver;

	public static WebDriver browser_Configuration(String type) {
		switch (type) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			break;

		case "firefox":

			System.setProperty("webdriver.firefox.driver", "");

			driver = new FirefoxDriver();
			break;

		}
		driver.manage().window().maximize();
		return driver;

	}
	
	public static WebElement findbyxpath(String xpathValue) {
		return driver.findElement(By.xpath(xpathValue));
	}

	public static void sendkeys(WebElement ele, String passvalue) {
		ele.sendKeys(passvalue);

	}

	public static void click(WebElement ele) {
		
		ele.click();
	}

	public static void dropdown(String type, WebElement ele, String passvalue) {

		Select sel = new Select(ele);

		switch (type) {
		case "By.value":

			sel.selectByValue(passvalue);
			break;

		case "By.text":

			sel.selectByVisibleText(passvalue);
			break;

		case "By.index":
			
			sel.selectByIndex(Integer.parseInt(passvalue));
			break;

		default:
			break;
		}

	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"//pic//"+name);
		FileUtils.copyFile(src, dest);
	}
}

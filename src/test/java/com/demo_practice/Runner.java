package com.demo_practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.Page_Object_Manager;
import com.practice.property.File_Reader_Manager;
import com.utility.Base_Practice;
import com.work.Book_Hotel;
import com.work.Login_Page;
import com.work.Search_Hotel;
import com.work.Select_Hotel;

public class Runner extends Base_Practice {

	public static WebDriver driver = browser_Configuration("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Runner.class);

	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_Config_Url();
		
		getUrl(url);

		//getUrl("https://adactinhotelapp.com/");
		
		log.info("URL launched");

		sendkeys(pom.get_Instance_Login().getUsername(), "arvinth08");

		sendkeys(pom.get_Instance_Login().getPassword(), "PRWRM6");

		click(pom.get_Instance_Login().getLogin_Btn());
		
		log.info("Sign in successfully");

		dropdown("By.value", pom.get_Instance_Search().getLocation(), "Melbourne");

		dropdown("By.value", pom.get_Instance_Search().getHotels(), "Hotel Sunshine");

		dropdown("By.value", pom.get_Instance_Search().getRoomtype(), "Double");

		dropdown("By.value", pom.get_Instance_Search().getRoomnos(), "2");

		sendkeys(pom.get_Instance_Search().getDatein(), "01/03/2022");

		sendkeys(pom.get_Instance_Search().getDateout(), "04/03/2022");

		dropdown("By.value", pom.get_Instance_Search().getAdultroom(), "2");

		dropdown("By.value", pom.get_Instance_Search().getChildroom(), "1");

		click(pom.get_Instance_Search().getSearch_Btn());

		Thread.sleep(2000);

		System.out.println("I standing b4 radio button");

		click(pom.get_Instance_Slt().getRadio_Btn());

		System.out.println("I clicked Radio button");

		click(pom.get_Instance_Slt().getContinue_Btn());

		Thread.sleep(2000);

		sendkeys(pom.get_Instance_Hotel().getFirstname(), "Arvinth");

		sendkeys(pom.get_Instance_Hotel().getLastname(), "siva");

		sendkeys(pom.get_Instance_Hotel().getAddress(), "Melbourne city");

		sendkeys(pom.get_Instance_Hotel().getCcnum(), "1234567890123456");

		dropdown("By.value", pom.get_Instance_Hotel().getCctype(), "AMEX");

		dropdown("By.value", pom.get_Instance_Hotel().getCcmonth(), "3");

		dropdown("By.value", pom.get_Instance_Hotel().getCcyear(), "2022");

		sendkeys(pom.get_Instance_Hotel().getCcvv(), "123");

		System.out.println("Filling the details");

		click(pom.get_Instance_Hotel().getBook_Btn());

		Thread.sleep(5000);

		System.out.println("Pressing iteneray");

		click(pom.get_Instance_Hotel().getIternity_Btn());

		System.out.println("Pressed Itenary");

		screenshot("test.png");
		
		log.info("Hotel Booked");

	}

}

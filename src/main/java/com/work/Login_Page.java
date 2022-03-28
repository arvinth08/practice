package com.work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;
	
	@FindBy(xpath="//*[@id='username']")
	private WebElement username;
	
	public Login_Page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

	@FindBy(xpath="//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login']")
	private WebElement login_Btn;
}

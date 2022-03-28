package com.work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath="//*[@id='radiobutton_0']")
	private WebElement radio_Btn;
	
public Select_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getRadio_Btn() {
		return radio_Btn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	@FindBy(xpath="//*[@id='continue']")
	private WebElement continue_Btn;

}

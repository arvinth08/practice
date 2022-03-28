package com.work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;
	
	@FindBy(xpath="//*[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//*[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//*[@id='cc_num']")
	private WebElement ccnum;
	
public Book_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCcvv() {
		return ccvv;
	}

	public WebElement getBook_Btn() {
		return book_Btn;
	}

	public WebElement getIternity_Btn() {
		return iternity_Btn;
	}

	@FindBy(xpath="//*[@id='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//*[@id='cc_exp_month']")
	private WebElement ccmonth;
	
	@FindBy(xpath="//*[@id='cc_exp_year']")
	private WebElement ccyear;
	
	@FindBy(xpath="//*[@id='cc_cvv']")
	private WebElement ccvv;
	
	@FindBy(xpath="//*[@id=\"book_now\"]")
	private WebElement book_Btn;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[19]/td[2]/input[2]")
	private WebElement iternity_Btn;
	
}

package com.work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;

	@FindBy(xpath="//*[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//*[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//*[@id='room_type']")
	private WebElement roomtype;
	
public Search_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}

	@FindBy(xpath="//*[@id='room_nos']")
	private WebElement roomnos;
	
	@FindBy(xpath="//*[@id='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath="//*[@id='datepick_out']")
	private WebElement dateout;
	
	@FindBy(xpath="//*[@id='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath="//*[@id='child_room']")
	private WebElement childroom;
	
	@FindBy(xpath="//*[@id='Submit']")
	private WebElement search_Btn;
	
	
}

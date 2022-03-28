package com.pom;

import org.openqa.selenium.WebDriver;

import com.work.Book_Hotel;
import com.work.Login_Page;
import com.work.Search_Hotel;
import com.work.Select_Hotel;

public class Page_Object_Manager {

	public WebDriver driver;

	private Login_Page login;

	private Search_Hotel search;

	private Select_Hotel slt;

	private Book_Hotel hotel;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

	}

	public Login_Page get_Instance_Login() {

		if (login == null) {

			login = new Login_Page(driver);

		}

		return login;
	}

	public Search_Hotel get_Instance_Search() {

		if (search == null) {

			search = new Search_Hotel(driver);

		}

		return search;
	}

	public Select_Hotel get_Instance_Slt() {

		if (slt == null) {

			slt = new Select_Hotel(driver);

		}

		return slt;
	}

	public Book_Hotel get_Instance_Hotel() {

		if (hotel == null) {

			hotel = new Book_Hotel(driver);

		}

		return hotel;
	}

}

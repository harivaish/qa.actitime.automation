package com.actidemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actidemo.base.driverscript;

/**
 * 
 * This is logoutpage
 * Developed by hari
 * Date 09/25/2023
 *
 */
public class logoutpage extends driverscript {
	
	@FindBy(id="logout") WebElement linklogout;
	
	
	public logoutpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogout() {
		linklogout.click();
	}
	public String getlogoutpagetitle(){
		return driver.getTitle();
}
}

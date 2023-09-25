package com.actidemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actidemo.base.driverscript;
/**
 * This is Actitimepage
 * Developed by hari
 * Date 09/25/2023
 * 
 */
public class actiTIMEpage extends driverscript {
	
	//page element
	
	
	@FindBy(xpath="//a[@class='userProfileLink username ']")WebElement linkuserprofile;
	@FindBy(id="container_tasks")WebElement menuTasks;
	@FindBy(id="SubmitTTButton")WebElement buttonsavechanges;
	@FindBy(id="logoutLink")WebElement buttonlogout;

	//page factory
	
	public actiTIMEpage() {
		PageFactory.initElements(driver, this);
	}
	
	//page action
	
	
	public String isuserprofiledisplayed() {
		return linkuserprofile.getText();
	}
	public void clickTasksmenu() {
		menuTasks.click();
	}
	public void clicksavechanges() {
		buttonsavechanges.click();
	}
	public void clicklogout() {
		buttonlogout.click();
	}
	public String getactiTIMEpagetitle() {
		return driver.getTitle();
	}
}

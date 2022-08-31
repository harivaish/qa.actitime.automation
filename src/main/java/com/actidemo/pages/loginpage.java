package com.actidemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actidemo.base.driverscript;

public class loginpage extends driverscript {
	
	// page elements:
	
	@FindBy(id="headerContainer")WebElement headercontainerPleaseidentifyyourself;
	@FindBy(id="username")WebElement textboxusername;
	@FindBy(name="pwd")WebElement textboxpassword;
	@FindBy(id="keepLoggedInCheckBox")WebElement radiobuttonKeepmeloggedin;
	@FindBy(id="loginButton")WebElement buttonlogin;
	@FindBy(id="toPasswordRecoveryPageLink")WebElement linkForgotyourpassword;
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement imageactilogo;
	@FindBy(xpath="(//span[@class='errormsg'])[1]")WebElement errormessage;
	
	// page initializing using page factory:
	
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	// page actions:
	
	public boolean isPleaseidentifyyourselfdisplayed() {
		return headercontainerPleaseidentifyyourself.isDisplayed(); 
	}
	public void enterusername(String username) {
		textboxusername.sendKeys(username);
		}
	public void enterpassword(String password) {
		textboxpassword.sendKeys(password);
	}
	public void clickKeepmeloggedin() {
		radiobuttonKeepmeloggedin.click();
	}
	public void clicklogin() {
		buttonlogin.click();
	}
	public boolean isForgotyourpassworddisplayed() {
		return linkForgotyourpassword.isDisplayed();
	}
	public boolean isactilogodisplayed() {
		return imageactilogo.isDisplayed();
	}
	public String getloginpagetitle() {
		return driver.getTitle();
	}
	public boolean iserrormessagedisplayed() {
		return errormessage.isDisplayed();
	}

}

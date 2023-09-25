package com.actidemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actidemo.base.driverscript;
/**
 * This is Taskpage
 * Developed by hari
 * Date 09/25/2023
 * 
 */
public class Taskpage extends driverscript {
	
	@FindBy(xpath="//div[@class='title ellipsis']")WebElement buttonaddnew;
	@FindBy(xpath="//div[@class='item createNewCustomer']")WebElement buttonnewcustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")WebElement textboxentercustomername;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement textareaentercustomerdescription;
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")WebElement dropdownselectcustomer;
	@FindBy(xpath="//div[@class='itemRow cpItemRow ']")WebElement dropdownBigbangcompany;
	@FindBy(xpath="//div[@class='components_button withPlusIcon']")WebElement buttoncreatecustomer;
	@FindBy(xpath="//span[@class='innerHtml']")WebElement sucessmessage;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")WebElement textboxstarttypingname;
	@FindBy(xpath="//span[@class='highlightToken']")WebElement customernamesearched;
	@FindBy(xpath="//div[@class='filteredContainer']//div[@class='editButton']")WebElement editbutton;
	@FindBy(xpath="(//div[@class='action'])[1]")WebElement buttonactions;
	@FindBy(xpath="(//div[@class='deleteButton'])[1]")WebElement buttondelete;
	@FindBy(xpath="(//span[@class='submitTitle buttonTitle'])[1]")WebElement buttondeletepermanently;
	@FindBy(xpath="//span[@class='innerHtml']")WebElement successmessage;
	
	public Taskpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickaddnew() {
		buttonaddnew.click();
	}
	public void clicknewcustomer() {
		buttonnewcustomer.click();
	}
	public void entercustomername(String customername) {
		 textboxentercustomername.sendKeys(customername);
	}
	public void entercustomerdesc(String customerdesc) {
		textareaentercustomerdescription.sendKeys(customerdesc);
	}
    public void clickselectcustomerdropdown() {
    	dropdownselectcustomer.click();
    }
    public void clickBigbang() {
    	dropdownBigbangcompany.click();
    }
    public void clickcreatecustomer() {
    	buttoncreatecustomer.click();
    }
    public String getsucessmessage() {
    	return sucessmessage.getText();
    }
    public void starttypingname(String customername) {
    	textboxstarttypingname.sendKeys(customername);
    }
    public void clicknamesearched() {
    	customernamesearched.click();
    }
    public void clickeditbutton() {
    	WebDriverWait wait = new WebDriverWait(driver, 2000);
    	wait.until(ExpectedConditions.visibilityOf(editbutton));
    	editbutton.click();
    }
    public void clickactions() {
    	WebDriverWait wait = new WebDriverWait(driver, 2000);
    	wait.until(ExpectedConditions.visibilityOf(buttonactions));
    	buttonactions.click();
    }
    public void clickdelete() {
    	buttondelete.click();
    }
    public void clickdeletepermanently() {
    	buttondeletepermanently.click();
    }
    public String getsuccessmessage() {
    	return successmessage.getText();
    }
}

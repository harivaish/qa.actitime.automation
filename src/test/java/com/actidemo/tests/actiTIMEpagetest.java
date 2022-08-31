package com.actidemo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actiTIMEpagetest extends basetest {
	
	
	
	@Test
	public void testuserprofile() {
		
		login.enterusername("admin");
		login.enterpassword("manager");
		login.clickKeepmeloggedin();
		login.clicklogin();
		String exp = actiTIME.isuserprofiledisplayed();
		Assert.assertTrue(exp.contains("John Doe"));
	}
	@Test
	public void testactitimepagetitle() {
		
		String actual = "actiTIME - Login";
	  String expected = actiTIME.getactiTIMEpagetitle();
	  Assert.assertEquals(actual, expected);
	    
	}
	@Test
	public void testsavechanges() throws InterruptedException {
		
		login.enterusername("admin");
		login.enterpassword("manager");
		login.clickKeepmeloggedin();
		login.clicklogin();
		Thread.sleep(3000);
		actiTIME.clicksavechanges();
	}
	@Test
	public void testTasksmenu() {
		login.enterusername("admin");
		login.enterpassword("manager");
		login.clickKeepmeloggedin();
		login.clicklogin();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("container_tasks"))).click();
		actiTIME.clickTasksmenu();
		
	}

}

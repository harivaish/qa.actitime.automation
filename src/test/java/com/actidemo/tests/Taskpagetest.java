package com.actidemo.tests;

import org.testng.annotations.Test;

public class Taskpagetest extends basetest {
	@Test (priority=1)
	public void testcreatecustomer() throws InterruptedException {
		
		login.enterusername("admin");
		login.enterpassword("manager");
		login.clickKeepmeloggedin();
		login.clicklogin();
		actiTIME.clickTasksmenu();
		task.clickaddnew();
		task.clicknewcustomer();
		task.entercustomername("dummy");
		task.entercustomerdesc("nee oru dummy");
		Thread.sleep(3000);
		task.clickselectcustomerdropdown();
		Thread.sleep(2000);
		task.clickBigbang();
		task.clickcreatecustomer();
		String mess = task.getsucessmessage();
		System.out.println(mess);
	}
	@Test(priority=2)
	public void deletecustomer() throws InterruptedException {
		
		login.enterusername("admin");
		login.enterpassword("manager");
		login.clickKeepmeloggedin();
		login.clicklogin();
		actiTIME.clickTasksmenu();
		task.starttypingname("dummy");
		task.clicknamesearched();
		task.clickeditbutton();
		task.clickactions();
		task.clickdelete();
		task.clickdeletepermanently();
		String del = task.getsucessmessage();
		System.out.println(del);
	}
	
	
	

}

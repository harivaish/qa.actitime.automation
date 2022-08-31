package com.actidemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actidemo.utils.Helper;

public class loginpagetest extends basetest {

	
	

//	@Test
	public void testPleaseidentifyyourself() {

		boolean flag = login.isPleaseidentifyyourselfdisplayed();
		Assert.assertTrue(flag);
	}

	@Test(dataProvider = "actidata")
	public void testlogin(String username,String password) {

		login.enterusername(username);
		login.enterpassword(password);
		login.clickKeepmeloggedin();
		Helper.sleep();
		login.clicklogin();
		Helper.sleep();
	}

//	@Test
	public void testforgotpassword() {

		boolean flag = login.isForgotyourpassworddisplayed();
		Assert.assertTrue(flag);
	}
    @Test
	public void testactilogo() {
		
		boolean flag = login.isactilogodisplayed();
		Assert.assertTrue(flag);
    }
//    @Test
    public void getloginpagetitle() {
    	String expected = login.getloginpagetitle();
    	Assert.assertTrue(expected.contains("Login"));
    }

}

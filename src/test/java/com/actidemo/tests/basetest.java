package com.actidemo.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.actidemo.base.driverscript;
import com.actidemo.pages.Taskpage;
import com.actidemo.pages.actiTIMEpage;
import com.actidemo.pages.loginpage;
import com.actidemo.utils.Excelutils;

public class basetest extends driverscript {

loginpage login;
actiTIMEpage actiTIME;
Taskpage task ;
	
	@BeforeMethod
	public void setup() {

		initapplication();
		login = new loginpage();
		actiTIME = new actiTIMEpage();
		 task = new Taskpage();

	}

	@AfterMethod
	public void teardown() {
		quitdriver();
	}
	@DataProvider(name="actidata")
	public Object[][] testdata() {
		Excelutils xl = new Excelutils("./testdata/actidata.xlsx");
		int row = xl.getrowcount(0);
		
		Object[][] data = new Object[row][2];
		for(int i=0;i<row;i++) {
			data[i][0]=xl.getallcelldata(0, i, 0);
			data[i][1]=xl.getallcelldata(0, i, 1);
		}
		return data;
}
}

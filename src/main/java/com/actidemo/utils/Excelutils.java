package com.actidemo.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.actidemo.base.driverscript;

public class Excelutils extends driverscript{
	
	XSSFWorkbook wb ;
	
	public Excelutils(String excelpath) {
		try {
			File file = new File(excelpath);
			FileInputStream fis = new FileInputStream(file);
			 wb = new XSSFWorkbook(fis);
			}
		catch(Exception e) {
			System.out.println("not able to retrive the data from excel ");
		}
	}
	public int getrowcount(int sheetnum) {
		return wb.getSheetAt(sheetnum).getLastRowNum()+1;
	
	}
	public String getallcelldata(int sheetnum,int row,int col) {
		 return wb.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
		 
	}

}

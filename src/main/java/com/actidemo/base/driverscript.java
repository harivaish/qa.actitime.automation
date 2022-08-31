package com.actidemo.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverscript {
	
	public static WebDriver driver;
	Properties prop;
	
	public driverscript() {
		try {
			File file = new File("./config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			}
		catch(Exception e) {
			System.out.println("not able to get the file "+e.getMessage());
			}
	}
	
	public void initapplication() {
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./browser/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./browser/msedgedriver.exe");
			driver= new EdgeDriver();
			}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./browser/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("the browser is not supported");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	     geturl();
	}
	
	public void geturl() {
		String url = prop.getProperty("URL");
		driver.get(url);
	}
	
	public void quitdriver() {
		driver.close();
	}

}

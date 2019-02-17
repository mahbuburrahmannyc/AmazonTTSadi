package com.usa.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.usa.amazonpagefactory.AmazonPageFactory;

public class GenericClass {


	WebDriver driver;
	
	AmazonPageFactory PF;
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadim\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		PF=PageFactory.initElements(driver, AmazonPageFactory.class);
		driver.get(PF.getUrl());
		
		driver.manage().window().maximize();
		
	}
		
		public void signin() {
			
			PF.getClicksignbutton().click();
			PF.getUnamebox().sendKeys(PF.getUname());
		
			PF.getUpassbox().sendKeys(PF.getUpass());
			PF.getSignin().click();
			
		}
	}



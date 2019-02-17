package com.usa.amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPageFactory {

	private String url="https://www.amazon.com/";
	private String Uname="sadimahmud24@gmail.com";
	private String Upass="0162s6edgeplus";

	 @FindBy(xpath="//*[@class=\\\"nav-a nav-a-2\\\"])[1]")
	 private WebElement clicksignbutton;
	 
	 @FindBy(xpath="//*[@id=\\\"ap_email\\\"]")
	 private WebElement unamebox;
	 
	 @FindBy(xpath="//*[@id=\\\"ap_password\\\"]")
	 private WebElement upassbox;
	 
	 @FindBy(xpath="//*[@id=\\\"signInSubmit\\\"]")
	 private WebElement signin;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getUpass() {
		return Upass;
	}

	public void setUpass(String upass) {
		Upass = upass;
	}

	public WebElement getClicksignbutton() {
		return clicksignbutton;
	}

	public void setClicksignbutton(WebElement clicksignbutton) {
		this.clicksignbutton = clicksignbutton;
	}

	public WebElement getUnamebox() {
		return unamebox;
	}

	public void setUnamebox(WebElement unamebox) {
		this.unamebox = unamebox;
	}

	public WebElement getUpassbox() {
		return upassbox;
	}

	public void setUpassbox(WebElement upassbox) {
		this.upassbox = upassbox;
	}

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}
	 
	 
	 
	 

	
	}



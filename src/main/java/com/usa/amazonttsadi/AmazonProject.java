package com.usa.amazonttsadi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProject {

	public static void main(String[] args) {
		

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//*[@class=\"nav-a nav-a-2\"])[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("sadimahmud24@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("0162s6edgeplus");
		
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		System.out.println(driver.getTitle());
		
	}

}

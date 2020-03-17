package com.Techlistic.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class alertwindow {
	WebDriver driver;
	@Test
	public void alert() {
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement button =driver.findElement(By.name("btnLogin"));
		 driver.findElement(By.name("uid")).sendKeys("mngr246404");					
	     driver.findElement(By.name("password")).sendKeys("ararybA");
	     js.executeScript("arguments[0].click();", button);
	     js.executeScript("alert('Welcome to Guru99');"); 
	}
	

}

package com.Techlistic.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	WebDriver driver;
	public static WebDriver startapplication(WebDriver driver,String URL, String Browser) {
		if(Browser=="firefox") {
			System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		 if(Browser=="chrome") {
			System.setProperty("webdriver.Chrome.driver","./Drivers\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
	
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}
	public  static WebDriver quitbrowser(WebDriver driver) throws Exception {
		Thread.sleep(2000);
		driver.close();
		return driver;	
	}

}

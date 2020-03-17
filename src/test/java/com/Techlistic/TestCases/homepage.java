package com.Techlistic.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Techlistic.basic.Browserfactory;

public class homepage {
	WebDriver driver;
@BeforeClass	
public void start() {
	driver=Browserfactory.startapplication(driver,"https://www.techlistic.com/","firefox");
}
 @Test(enabled=true,priority=1,groups="homepage")
public void TC_001()
 {
	String actual=driver.getTitle();
	String expct="Techlistic";
	//Assert.assertEquals(actual, expct);
	//System.out.println("test case pass");
	
	Assert.assertTrue(actual.contains(expct));	
	System.out.println("TC-001 pass");
}
 @Test(enabled=true,priority=2,groups="homepage")
 public void TC_002()
 {
		
		String actual=driver.getCurrentUrl();
		String expct="//www.techlistic.com/";
		//Assert.assertEquals(actual, expct);
		//System.out.println("test case pass");
		
		Assert.assertTrue(actual.contains(expct));	
		System.out.println("TC-002 pass");
	}
 @Test(enabled=true,priority=3,groups="homepage")
 public void TC_003()
 {
		String actual=driver.getPageSource();
		String expct="Techlistic";
		//Assert.assertEquals(actual, expct);
		//System.out.println("test case pass");
		
		Assert.assertTrue(actual.contains(expct));	
		System.out.println("TC-003 pass");
	}
 
 @Test(enabled=true,priority=4,groups="JAVA")
 public void TC_004()
 {
	 driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[contains(text(),'Java')]")).click();
		String actual=driver.getTitle();
		String expct="Java Tutorials Series - Java For Selenium";
		//Assert.assertEquals(actual, expct);
		//System.out.println("test case pass");
		
		Assert.assertTrue(actual.contains(expct));	
		System.out.println("TC-004 pass");
		driver.navigate().back();
	}
 @Test(enabled=true,priority=5,groups="SELENIUM")
 public void TC_005()
 {
	 driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[contains(text(),'Selenium')]")).click();
		String actual=driver.getTitle();
		String expct="Selenium Tutorial - Learn Selenium from Comprehensive Series of 40 Coding Tutorials";
		//Assert.assertEquals(actual, expct);
		//System.out.println("test case pass");
		
		Assert.assertTrue(actual.contains(expct));	
		System.out.println("TC-005 pass");
		driver.navigate().back();
	}

	@Test(enabled=true,priority=6,groups="TESTNG")
	public void TC_006()
	 {
		 driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[contains(text(),'TestNG')]")).click();
			String actual=driver.getTitle();
			String expct="Selenium with TestNG Integration - Tutorial Series";
			//Assert.assertEquals(actual, expct);
			//System.out.println("test case pass");
			
			Assert.assertTrue(actual.contains(expct));	
			System.out.println("TC-006 pass");
			driver.navigate().back();
		}
	
	@Test(enabled=true,priority=7,groups="FORM FILL")
	public void TC_007() throws Exception
	 {
		driver=Browserfactory.startapplication(driver,"https://www.techlistic.com/p/selenium-practice-form.html","firefox");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pavan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='exp-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03-06-2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profession-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tool-0']")).click();
		Thread.sleep(2000);
		WebElement upload=driver.findElement(By.xpath("//input[@id='photo']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",upload);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("‪C:\\Users\\welcome\\Desktop\\AutoIt\\fileupload.exe");
		
		}
	
	
 
@AfterClass
public void end() throws Exception {
	driver =Browserfactory.quitbrowser(driver);
}
}

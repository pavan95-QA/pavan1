package com.Techlistic.TestCases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Techlistic.basic.Browserfactory;

public class automategooglesearch {
	 private WebDriver driver;  
	 
	 
	 
	  @Test
	  public void googlesearch() throws Exception {
		  driver=Browserfactory.startapplication(driver,"https://www.google.com/","firefox");
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("pavan"); 
		 List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
       Thread.sleep(10000);
		 System.out.println(list.size());
		 for(int i=0;i<list.size();i++)
		 {
			String text=list.get(i).getText();
			System.out.println(text);
			if(text.contains("pavan kalyan son")) 
			{
				list.get(i).click();
				break;
				
			}
		 }  	 
		 }
	  }


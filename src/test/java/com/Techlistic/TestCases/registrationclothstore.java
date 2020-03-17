package com.Techlistic.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Techlistic.basic.Browserfactory;

public class registrationclothstore {
	WebDriver driver;
	
	@Test
	public void TC_001() throws Exception {
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("bommena9@gmail.com");
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("pavan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("kumar");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("bommena9@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("pavanb95");
		WebElement date=driver.findElement(By.xpath("//select[@id='days']"));
		Select dt=new Select(date);
		Thread.sleep(2000);
		dt.selectByValue("10");
		WebElement month=driver.findElement(By.xpath("//select[@id='months']"));
		Select mt=new Select(month);
		Thread.sleep(3000);
      mt.selectByIndex(3);
		WebElement year=driver.findElement(By.xpath("//select[@id='years']"));
		Select yr=new Select(year);
		Thread.sleep(2000);
		yr.selectByValue("1995");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("texas ,austin,73301");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("austin");
		Thread.sleep(2000);
		Select st=new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		Thread.sleep(2000);
		st.selectByVisibleText("Texas");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("73301");
		Thread.sleep(2000);
		Select ct=new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
		Thread.sleep(2000);
		ct.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("7301786115");
		Thread.sleep(2000);
		WebElement ad=driver.findElement(By.xpath("//input[@id='alias']"));
		ad.clear();
		ad.sendKeys("texas ,austin,73302");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		System.out.println(driver.getTitle());		
	}
}

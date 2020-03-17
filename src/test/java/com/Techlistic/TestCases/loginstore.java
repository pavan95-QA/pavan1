package com.Techlistic.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class loginstore {
	WebDriver driver;
	@Test
	public void TC_001() throws Exception {
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bpavan1995@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("pavanb95");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();

		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		WebElement WM=driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"));
		act.moveToElement(WM).click().perform();
		Thread.sleep(2000);
		String product=driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
		System.out.println(product);
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top']"));
		Thread.sleep(2000);
		search.sendKeys(product);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		String product1=driver.findElement(By.xpath("//div[@class='right-block']//a[@class='product-name'][contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
		
		if(product.equalsIgnoreCase(product1)) {
			System.out.println("test case is pass");
		}else {
			System.out.println("test case is failed");
		}
}
}
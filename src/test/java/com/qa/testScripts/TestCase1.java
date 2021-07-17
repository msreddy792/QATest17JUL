package com.qa.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void setup() throws InterruptedException
	{
		// Start chrome browser
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open the addressboo app on the chrome browser
		
		driver.get("http://34.133.214.251:49153/addressbook/");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		// test the elements on the webpage
		// selenium ==> address of the target element on webpage
		// Locators: id, name, linkText, partial, xpath, CSS , classname, tagname
		// selenium will perform the action
		// xpath: //tagname[@attributename='value']

	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")).click();
		
	Thread.sleep(2000)	;
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[3]/input")).sendKeys("Sonalnew123");
		
	Thread.sleep(2000)	;
		
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input")).sendKeys("Mittalnew123");
		
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]/input")).sendKeys("abc@gmail.com");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[6]/td[3]/div/input")).sendKeys("5/19/21,");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	
 driver.close();	
		
	
		
	}

}

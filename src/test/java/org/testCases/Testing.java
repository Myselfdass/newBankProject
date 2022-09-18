package org.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseUtils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing extends BaseClass{
	
	@BeforeClass
	public void browser() throws InterruptedException {
		browserLaunch("chrome");
		Thread.sleep(5000);
	}

	@Test(dataProvider = "dass")
	public void testCase(String str1,String str2, String str3, String str4, String str5,String str6) throws InterruptedException {
		Thread.sleep(4000);
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(str1);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(str2);
		driver.findElement(By.xpath("//input[@name=\"re_password\"]")).sendKeys(str3);
		driver.findElement(By.xpath("//input[@name=\"full_name\"]")).sendKeys(str4);
		driver.findElement(By.xpath("(//input[@class=\"reg_input\"])[5]")).sendKeys(str5);
		driver.findElement(By.xpath("//input[@name=\"captcha\"]")).sendKeys(str6);
			
	}
	
	@AfterClass
	public void quit() throws InterruptedException {
		driver.close();
		
	}
	
	@class
	public void wait(){
		
		driver.getWindowHandle();
	}
	
	
		
	}
	

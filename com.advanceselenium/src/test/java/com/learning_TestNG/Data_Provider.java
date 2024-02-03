package com.learning_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider 
{

	@Test(Data Provider = "loginData")
	 public void loginTest(String username, String Password) {
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("");
		driver.findElement(By.id("Password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
		
		@DataProvider
		public Object [] [] loginData()
		
		{
			
			Object  [] [] data = new Object [3] [2];
			
			data [0] [0] = "ajeetkumar6056@gmail.com";
			data [0] [1] = "ajeet6506";
			
			data [1] [0] = "ajeetkumar6056@gmail.com";
			data [1] [1] = "ajeet6506";
			
			data [2] [0] = "ajeetkumar6056@gmail.com";
			data [2] [1] = "ajeet6506";
			
			
			return data;
		
			
		}
			
			
		}
	


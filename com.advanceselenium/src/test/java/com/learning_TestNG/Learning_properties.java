package com.learning_TestNG;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_properties 
{
	@Test()
	  public void loginTest() throws Throwable
	  {
		  FileInputStream fis = new FileInputStream("./src/test/resources/data/commonData.properties");
		  Properties prop = new Properties();
		  prop.load(fis);
		  String URL = prop.getProperty("URL");
		  String USERNAME = prop.getProperty("username");
		  String PASSWORD = prop.getProperty("password");
		  
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(URL);
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(USERNAME);
			driver.findElement(By.id("Password")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			
		  
	  }
   
}

package com.learning_TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_Hard_Assert 
{
 
@Test
 public void loginTest() throws InterruptedException {
 
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	Assert.assertEquals(driver.getTitle(),"flipkart","I am validating Title");
	driver.findElement(By.linkText("Log in")).click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/");
	driver.findElement(By.id("Email")).sendKeys("ajeet6506@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("9798457433");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
	Thread.sleep(2000);
	
	
}
 
}

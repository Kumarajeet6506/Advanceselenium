package com.learning_TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_Soft_Assert 
{
	@Test
	 public void loginTest() throws InterruptedException {
	 
	 SoftAssert ast = new SoftAssert();
	 
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		ast.assertEquals(driver.getTitle(),"Demo Web","I am validating title");
		
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/login","I am validating Current URL");
		driver.findElement(By.id("Email")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nikhil123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		ast.assertEquals(driver.getTitle(),"Demo Web Shop","I am validating title");
		Thread.sleep(2000);
		//driver.quit();
		ast.assertAll();
	}
		
}

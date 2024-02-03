package com.generic_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Test 
{
   public WebDriver driver;
   @Parameters("browser")
   @BeforeClass(AlwaysRun = true)
   public void openBrowser(String Browser) {
	   
	   if(Browser.equals("chrome")) 
	   {
		   driver = new ChromeDriver();
	   }
	   else if(Browser.equals("chrome")) 
	   {
		   driver = new EdgeDriver();
	   }
    else{
	   driver = new ChromeDriver();
   }
   
	 //  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(File_Utility);
   
   }
      
   @BeforeMethods(groups = "smokeTest")
   public void loginToDWS1() {
	   driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nikhil123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
   }
   
   @AfterMethod()
   public void loginToDWS() {
	   driver.findElement(By.linkText("Logout")).click();
   }
   
   @AfterClass
   public void closeBrowser() {
	   driver.quit();
   }
   
}
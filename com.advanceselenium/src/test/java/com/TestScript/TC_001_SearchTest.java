package com.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;

public class TC_001_SearchTest extends Base_Test
{
	@Test
	  public void SearchTest() throws InterruptedException 
	  {
			
			driver.findElement(By.name("q")).sendKeys("mob",Keys.ENTER);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			

}
}
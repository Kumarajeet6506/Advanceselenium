package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.generic_Library.Webdriver_utility;
import com.objectRepository.LoginPage;
import com.objectRepository.WelcomePage;

public class Learning_Extent_Report 
{
	@Test
    public void loginTest() throws InterruptedException 
   {
	    
		ExtentSparkReporter spark=new ExtentSparkReporter("src/test/resources/Reports/FirstReport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		
		ExtentTest test = report.createTest("loginTest");
	        
	 		ChromeDriver driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 		driver.get("https://demowebshop.tricentis.com/");
	 		
	 		try {
			  Assert.assertEquals(driver.getTitle(), "DWS")	;
			  test.log(Status.INFO,"Demo Web Shop opened...");
			
	 		WelcomePage wp = new WelcomePage(driver);
	 		wp.getLoginLink().click();
	 		
	 		LoginPage lp = new LoginPage(driver);
	 		lp.getEmailTextField().sendKeys("ajeet6506@gmail.com");
	 		driver.navigate().refresh();
	 		
	 		lp.getEmailTextField().sendKeys("ajeet6506@gmail.com");
	 		lp.getPasswordTextField().sendKeys("9798457433");
	 		lp.getLoginButton().click();
	 		
	 		Thread.sleep(2000);
	 		driver.quit();
	 		
	 		} catch (Throwable e) {
				test.log(Status.FAIL,"fail.....");
				test.addScreenCaptureFromBase64String(Webdriver_utility.getScreenshotPath(driver));
			}
	 	
	 		driver.quit();
	 		report.flush();
	 	
	 		
	   
	   
   }
}

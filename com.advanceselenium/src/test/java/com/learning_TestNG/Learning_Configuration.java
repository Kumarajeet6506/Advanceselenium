package com.learning_TestNG;

import org.testng.Reporter;

public class Learning_Configuration 
{
  @BeforeSuite
   public void beforeSuite()
   {
	  Reporter.log("Executing before suite",true);
   }
  
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("Executing before suite",true);
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("Executing before suite",true);
  }
  
  @AfterTest
  public void AfterTest()
  {
	  Reporter.log("Executing before suite",true);
  }
  
  
}

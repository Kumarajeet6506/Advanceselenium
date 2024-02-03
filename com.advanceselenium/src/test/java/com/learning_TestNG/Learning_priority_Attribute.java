package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_priority_Attribute 
{
	 @Test(priority=1) //acts like main method
	   public void registerTest() { //acts like test case
		   Reporter.log("Executing Register Test Case...", true); //steps of the test cases
		   
	   }
	   @Test(priority=0)
	   public void loginTest() { //acts like test case
		   Reporter.log("Executing Login Test Case...", true); //steps of the test cases
		   
	   }
	   @Test(priority=-1)
	   public void searchTest() { //acts like test case
		   Reporter.log("Executing search Test Case...", true); //steps of the test cases
		   
	   }
}

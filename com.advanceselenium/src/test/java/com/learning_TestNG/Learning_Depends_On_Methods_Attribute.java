package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Depends_On_Methods_Attribute 
{
	 @Test //acts like main method
	   public void registerTest() { //acts like test case
		   Reporter.log("Executing Register Test Case...", true); //steps of the test cases
		   
	   }
	   @Test(dependsOnMethods="registerTest")
	   public void loginTest() { //acts like test case
		   Reporter.log("Executing Login Test Case...", true); //steps of the test cases
		   
	   }
	   @Test(dependsOnMethods={"loginTest","registerTest"})
	   public void searchTest() { //acts like test case
		   Reporter.log("Executing Search Test Case...", true); //steps of the test cases
		   
	   }
}

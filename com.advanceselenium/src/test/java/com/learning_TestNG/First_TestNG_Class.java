package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class 
{
   @Test //acts like main method
   public void registerTest() { //acts like test case
	   Reporter.log("Executing Register Test Case...", true); //steps of the test cases
	   
   }
   @Test
   public void loginTest() { //acts like test case
	   Reporter.log("Executing Register Test Case...", true); //steps of the test cases
	   
   }
   @Test
   public void searchTest() { //acts like test case
	   Reporter.log("Executing Register Test Case...", true); //steps of the test cases
	   
   }
   
}

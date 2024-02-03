package com.learning_TestNG;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic_Library.File_Utility;

public class Learning_Excel_File 
{
 @Test
 public void registerTest() {
 
 FileInputStream fis = new FileInputStream("./src/test/resources/data/");
 Workbook book = WorkbookFactory.create(fis);
 Sheet sheet = book.getSheet("registerData");
 Row row = sheet.getRow(1);
 Cell cell = row.getCell(0);
 String firstname = cell.getStringCellValue();
 String lastname = row.getCell(1).getStringCellValue();
 String password = row.getCell(1).getStringCellValue();
 String confirmpassword = row.getCell(1).getStringCellValue();
 
 String gender = File_Utility.fetchSingleDatafromExcelString(lastname, 0, 0);
 
 
 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("URL");
	
	driver.findElement(By.linkText("Register")).click();
	if(gender.equals("Male")) {
		driver.findElement(By.id("gender-male")).click();
		
	}else {
		driver.findElement(By.id("gender-female")).click();
	}
	driver.findElement(By.id("Firstname")).sendKeys(firstname);
	driver.findElement(By.id("Lastname")).sendKeys(lastname);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("Confirmpassword")).sendKeys(confirmpassword);
	driver.findElement(By.name("register-button")).click();
 }
}

package com.generic_Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {

	public static String getPropertyValue(String key) throws Throwable {
	
	 FileInputStream fis = new FileInputStream("./src/test/resources/data/commonData.properties");
	  Properties prop = new Properties();
	  prop.load(fis);
	  return prop.getProperty(key);
	}
      public static String fetchSingleDatafromExcelString(String sheetName,int rownum, int cellNum) throws Throwable {
	 
	 FileInputStream fis = new FileInputStream("./src/test/resources/data/testScriptdata");
	 Workbook book = WorkbookFactory.create(fis);
	 Sheet sheet = book.getSheet("registerData");
	 Row row = sheet.getRow(1);
	 Cell cell = row.getCell(0);
	 String firstname = cell.getStringCellValue();
	 String lastname = row.getCell(1).getStringCellValue();
	 String password = row.getCell(1).getStringCellValue();
	 String confirmpassword = row.getCell(1).getStringCellValue();
	return cell.getStringCellValue();
	
      }
      
        public static Object[][] fetchMultipleDataFromExcel(String sheetName) throws Throwable {
        	
        	 FileInputStream fis = new FileInputStream("./src/test/resources/data/searchScriptdata.xlsx");
        	 Workbook book = WorkbookFactory.create(fis);
        	 Sheet sheet = book.getSheet("searchData");
        	 
        	 int rowCount = sheet.getPhysicalNumberOfRows();
        	 int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
        	 
        	 
        	Object[][] data = new Object[rowCount-1][cellCount];
        	
        	for(int i = 1; i<rowCount; i++) {
        		for (int j = 0; j<cellCount; j++) {
        			data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
					
				}
        	}
        	
        	 return data;
        	 
        	
        	
        	
        }
	
}

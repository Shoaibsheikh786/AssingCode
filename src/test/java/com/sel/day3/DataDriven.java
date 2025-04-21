package com.sel.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataDriven {

	public static void main(String[] args) throws IOException {
    
		//1.property file ____.properties
		//2. Excel file
		
		//1. File Location of file
		File file=new File("./config.properties");
		
		//2. create connection 
		FileInputStream fis=new FileInputStream(file);
		
		
		//3. Property Class
		Properties pr=new Properties();
		pr.load(fis);
		
		
		//we pass key , we get values
		
		String val=pr.getProperty("browser");
		if(val.equals("chrome"))
		{
			WebDriver driver=new ChromeDriver();
		}
		else if(val.equals("firefox"))
		{
			WebDriver driver=new FirefoxDriver();
		}
		
		
	}
	
	
	@Test
	public void readExcel() throws EncryptedDocumentException, IOException
	{
	  //1.file
		File file=new File("./swethaData.xlsx");
		
      //2. create connection
		FileInputStream fis=new FileInputStream(file);
		
	 // 3 . Type of file is excel
		
		Workbook wb=WorkbookFactory.create(fis);
		
   //  4. Sheet
		Sheet sheet=wb.getSheetAt(0);
		
   //  5. row 
		Row row= sheet.getRow(1);
		
   //  6. Coloumns
		Cell cell=   row.getCell(1);
		
		System.out.println(cell);
		
		
		
	}
	
	@Test
	public void readExcelFull() throws EncryptedDocumentException, IOException
	{
	  //1.file
		File file=new File("./swethaData.xlsx");
		
      //2. create connection
		FileInputStream fis=new FileInputStream(file);
		
	 // 3 . Type of file is excel
		
		Workbook wb=WorkbookFactory.create(fis);
		
   //  4. Sheet
		Sheet sheet=wb.getSheetAt(0);
		
        for(int i=0;i<sheet.getLastRowNum();i++)
        {
        	Row row=sheet.getRow(i);
        	for(int j=0;j<row.getLastCellNum();j++)
        	{
        		System.out.print(row.getCell(j)+"  ");
        	}
        	System.out.println("");
        }
		
		
	}

}

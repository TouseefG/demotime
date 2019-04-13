package com.actitime.pages;

import java.io.FileInputStream;

import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	//to get the data
	public static String getData(String filePath, String sheetName, int rn,int cn)
	{
		
		try {
			
			
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rn);
			Cell cel = row.getCell(cn);
			String data= cel.toString();
			return data;
		}
		catch(Exception e)
		{
			
			
			return "";
		}
		
	}
	//to get the row count
	public static int geRowCount(String filePath, String sheetName)
	{
		
		try {
			
			
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rowCount = sh.getLastRowNum();
			
			return rowCount;
		}
		catch(Exception e)
		{
			
			
			return -1;
		}
		
	}
	//to get the cell count
	public static int geCellCount(String filePath, String sheetName, int rn)
	{
		
		try {
			
			
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rn);
			int celCount=row.getLastCellNum();
			
			return celCount;
		}
		catch(Exception e)
		{
			
			
			return -1;
		}
		
	}
	
	// like this implement all other methods later
	
	
}

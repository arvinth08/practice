package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void particular_Cell_Data() throws IOException {

		File f = new File("C:\\Users\\91978\\eclipse-workspace\\Adactin_Booking\\testcase.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(1);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			String cellvalue = c.getStringCellValue();
			System.out.println(cellvalue);
		}
			else if (type.equals(CellType.NUMERIC)) {
				
				double cellvalue = c.getNumericCellValue();
				
				int value = (int) cellvalue;
				System.out.println(value);
		
			}
		
			
		}
	
	public static void All_Data() throws IOException {

        File f = new File("C:\\Users\\91978\\eclipse-workspace\\Adactin_Booking\\testcase.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					System.out.println(value);
					
				} 
				
				else if (type.equals(CellType.NUMERIC)) {
					
					double numericValue = c.getNumericCellValue();
					
					int v = (int) numericValue;
					
					String value = Integer.toString(v);
					
					System.out.println(value);
					
					
					
				}
				
			}
			
		}
		
		wb.close();
	}
	
	public static void particular_Row_Data() throws IOException {

		File f = new File("C:\\Users\\91978\\eclipse-workspace\\Adactin_Booking\\testcase.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			Cell c = r.getCell(1);
			
			CellType type = c.getCellType();
			
			if (type.equals(CellType.STRING)) {
				
				String value = c.getStringCellValue();
				System.out.println(value);
				
			} 
			
			else if (type.equals(CellType.NUMERIC)) {
				
				double numericValue = c.getNumericCellValue();
				
				int v = (int) numericValue;
				
				String value = Integer.toString(v);
				
				System.out.println(value);
				
			}
	   }
	}
	
	
public static void main(String[] args) throws IOException {
	
	System.out.println("The particular cell data :");
	
	particular_Cell_Data();
	
	System.out.println("All Data :");
	
	All_Data();
	
	System.out.println("The particular row :");
	
	particular_Row_Data();
}

}

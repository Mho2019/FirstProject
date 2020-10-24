package com.caci.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static Workbook wb;
	private static Sheet sh;
	public static void openExcel(String filepath) {
	
		try {
			FileInputStream fis = new FileInputStream(filepath);
			 wb = new XSSFWorkbook(fis); //format of excel is xlsx format
			//Workbook wb1 = new HSSFWorkbook(); //format of excel is xls format (this is for older format <2003)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//load the sheet 
	public static void loadExcelSheet(String sheetName) {
		 sh=wb.getSheet(sheetName);
	}
	
	public static int rowcount() {
		return sh.getPhysicalNumberOfRows();
		
	}
	
	public static int columncount(int rownum) {
		return sh.getRow(rownum).getLastCellNum();
		
	}
	
	public static String cellData(int row, int column) {
		return sh.getRow(row).getCell(column).toString();
				
	}
	//it will return 2 object array of data 
	public static Object[] [] exceldata(String filepath, String sheetName){
		openExcel(filepath);
		loadExcelSheet(sheetName);
		int rows=rowcount();
		int colums=columncount(0);
		Object[][] data= new Object[rows-1][colums];
		for (int i= 1; i < rows; i++) {
			for (int j= 0; j < colums; j++) {
			data[i-1][j]=cellData(i,j);	
		}
	
		
	}
		return data;
}}

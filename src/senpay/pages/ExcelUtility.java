package senpay.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	public ExcelUtility() {

	}

	public static void setExcelFile(String path, String SheetName) {
		try {
			FileInputStream ExcelFile = new FileInputStream(constant.PATH_TestData + constant.FILE_TestData);

			try {
				ExcelWBook = new XSSFWorkbook(ExcelFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ExcelWSheet = ExcelWBook.getSheet("login");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getCellData(int RowNum, int ColNum){
		try{
		Cell=ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData=Cell.getStringCellValue();
		return CellData;
		}catch (Exception e){
			 
			 return"";
	
		}
	}
	
	public static void setCellData(String Result, int ColNumx, int RowNumx){
		try{
		Row =ExcelWSheet.getRow(RowNumx);
		Cell = Row.getCell(ColNumx);
		 
		 if (Cell == null) {
		 
		 Cell = Row.createCell(ColNumx);
		 
		 Cell.setCellValue(Result);
		 
		 } else {
		 
		 Cell.setCellValue(Result);
		 
		 }
		 
		          // Constant variables Test Data path and Test Data file name
		 
		           FileOutputStream fileOut = new FileOutputStream(constant.PATH_TestData + constant.FILE_TestData);
		           String test=constant.PATH_TestData + constant.FILE_TestData;
		            System.out.println(test);
		 
		           ExcelWBook.write(fileOut);
		 
		           fileOut.flush();
		 
		 fileOut.close();
		 
		 }catch(Exception e){
		 
		 
		 
		 }
		 
		 }		
	}

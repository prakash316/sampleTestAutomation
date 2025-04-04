package com.testWeb.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
//How to read excel files using Apache POI
public class ReadExcel {
public static String getCellValue (int i, int j) throws IOException{

FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestData"+File.separator+"Web_TestData_v1.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(1);
Row row = sheet.getRow(i);
Cell cell = row.getCell(j);
String cellVal = cell.getStringCellValue();
return cellVal;
}

public static void setCellValue (int i, int j, String value) throws IOException{
FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestData"+File.separator+"Web_TestData_v1.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(1);
Row row = sheet.getRow(i);
if (row == null)
	row = sheet.createRow(i);
Cell cell = row.createCell(j);
cell.setCellValue(value);
FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") +File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestData"+File.separator+"Web_TestData_v1.xlsx");
workbook.write(fos);
fos.close();
}

}
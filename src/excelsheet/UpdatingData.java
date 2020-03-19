package excelsheet;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdatingData {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\Anu.xlsx");
		XSSFWorkbook excel=new XSSFWorkbook(fis);
		XSSFSheet sheet=excel.getSheet("Testing");
		XSSFRow row=sheet.getRow(1);
		XSSFCell column=row.createCell(1);
		column.setCellValue("perfect");
		
		FileOutputStream fos=new FileOutputStream("D:\\Anu.xlsx");
		excel.write(fos);
		System.out.println("data saved");
		excel.close();
		

			}	

	}



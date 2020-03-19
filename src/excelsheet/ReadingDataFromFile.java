package excelsheet;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingDataFromFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("D:\\Anu.xlsx");
XSSFWorkbook excel=new XSSFWorkbook(fis);
XSSFSheet sheet=excel.getSheet("Testing");
XSSFRow row=sheet.getRow(0);
XSSFCell column=row.getCell(1);
System.out.println(column.getStringCellValue());

	}

}

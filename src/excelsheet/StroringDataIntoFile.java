package excelsheet;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StroringDataIntoFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
XSSFWorkbook excel=new XSSFWorkbook();
XSSFSheet sheet=excel.createSheet("selenium");
XSSFRow row=sheet.createRow(5);
XSSFCell column=row.createCell(3);
column.setCellValue("Locators");



FileOutputStream fos=new FileOutputStream("D:\\test.xlsx");
excel.write(fos);
System.out.println("saved data");
excel.close();

	}

}

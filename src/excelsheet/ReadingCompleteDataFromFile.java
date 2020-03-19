package excelsheet;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompleteDataFromFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("D:/Anu.xlsx");
XSSFWorkbook excel=new XSSFWorkbook(fis);
XSSFSheet sheet=excel.getSheetAt(0);
for(int i=0;i<=sheet.getLastRowNum();i++) {
XSSFRow row=sheet.getRow(i);
for(int j=0;j<row.getLastCellNum();j++) {
	XSSFCell column=row.getCell(j);
	System.out.println(column.getStringCellValue());
}
	}


}
}
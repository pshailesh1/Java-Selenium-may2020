package TestNG_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
  @Test
  public void ReadData() throws IOException {
	  FileInputStream file1 = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Book1.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file1);
	  XSSFSheet sheet = workbook.getSheet("MAY 22");
	  System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	  System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	  System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
	  System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
	  System.out.println(sheet.getRow(4).getCell(0).getStringCellValue());
	  System.out.println(sheet.getRow(1).getCell(1).getNumericCellValue());
  }
}

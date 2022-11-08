package TestNG_Programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WriteEcxel {
  @Test
  public void WriteData() throws IOException 
  {
	  FileInputStream file1 = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Book1.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file1);
	  XSSFSheet sheet = workbook.getSheet("MAY 22");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		driver.getTitle();
		String Title = driver.getTitle();
		
	  Row row = sheet.createRow(10);
	  Cell cell = row.createCell(4);
	  cell.setCellValue(Title);
	  
	  FileOutputStream file2 = new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Book1.xlsx");
	  workbook.write(file2);
	  file2.close();
  }
}

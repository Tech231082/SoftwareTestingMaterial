package seleniumTutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {
	WebDriver driver;
	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 File src=new File("C:\\mytools\\idpass.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
	    Row row=sheet.getRow(1);
	    System.out.println(row);
		
		
		
		

	}

}

package seleniumTutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DataDrivenTest1 {
	static WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	
	@BeforeClass
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.facebook.com/");
        // To maximize the browser
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	void readDatatest() throws IOException {
		File file=new File("C:\\mytools\\idpassFacebook.xlsx");
		FileInputStream fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet("Sheet1");
		for(int i=1;i<=sheet.getFirstRowNum();i++) {
			cell=sheet.getRow(i).getCell(0);
			driver.findElement(By.xpath("//input[@type='email'][@name='email']")).clear();
			 driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys(cell.getStringCellValue());
			// Import data for password.
			 cell = sheet.getRow(i).getCell(1);
			 //cell.setCellType(Cell.CELL_TYPE_STRING);
			 driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).clear();          
			 driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys(cell.getStringCellValue());
			 // To click on Login button
			 driver.findElement(By.id("u_0_2")).click();
			//To write data in the excel
			 FileOutputStream fos=new FileOutputStream(file);
			 // Message to be written in the excel sheet
			     String message = "Pass";
			     // Create cell where data needs to be written.
			     sheet.getRow(i).createCell(2).setCellValue(message);
			         
			     // finally write content
			     workbook.write(fos);
			     System.out.println("Data Written in Sheet");
		}


	}

}

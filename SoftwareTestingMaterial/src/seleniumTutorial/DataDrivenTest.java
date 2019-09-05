package seleniumTutorial;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {
	static WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
    @BeforeClass
    public static void initialization(){
        // To set the path of the Chrome driver.
    	System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
    driver = new ChromeDriver();
         
        // To launch facebook
        driver.get("http://www.facebook.com/");
        // To maximize the browser
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       }

	@Test
	public void fblogintest() throws IOException{
		File src=new File("C:\\mytools\\idpassFacebook.xlsx");   
		 // Load the file.
		 FileInputStream fis = new FileInputStream(src);
		 // Load he workbook.
		 workbook = new XSSFWorkbook(fis);
		 // Load the sheet in which data is stored.
		 sheet= workbook.getSheetAt(0);
		 for(int i=1; i<=sheet.getLastRowNum(); i++){
		 /*I have added test data in the cell A2 as "testemailone@test.com" and B2 as "password"
		 Cell A2 = row 1 and column 0. It reads first row as 0, second row as 1 and so on 
		 and first column (A) as 0 and second column (B) as 1 and so on*/ 
		 
		 // Import data for Email.
		 cell = sheet.getRow(i).getCell(0);
		 //cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.xpath("//input[@type='email'][@name='email']")).clear();
		 driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys(cell.getStringCellValue());
		 
		 // Import data for password.
		 cell = sheet.getRow(i).getCell(1);
		 //cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).clear();          
		 driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys(cell.getStringCellValue());
		 // To click on Login button
		 driver.findElement(By.id("u_0_2")).click();
		 // To click on Account settings dropdown 
		 //driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
		 // To click on logout button
		// driver.findElement(By.xpath("//text()[.='Log Out']/ancestor::span[1]")).click();
		
		
	}

}
}
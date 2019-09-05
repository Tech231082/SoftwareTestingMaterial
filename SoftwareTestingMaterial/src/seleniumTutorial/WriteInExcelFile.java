package seleniumTutorial;

import java.io.FileInputStream;
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


public class WriteInExcelFile {

	public static void main(String[] args) throws IOException{

    FileInputStream fis=new FileInputStream("c:\\mytools\\idpaasTest");
    XSSFWorkbook book=new XSSFWorkbook(fis);
    XSSFSheet sheet=book.getSheet("TestData");
   // XSSFSheet sheet = book.getSheetAt(0);
    Row row=sheet.createRow(3);
    Cell cell = row.createCell(1);
    cell.setCellType(null);
    cell.setCellValue("SoftwareTestingMaterial.com");
    FileOutputStream fos = new FileOutputStream("c:\\mytools\\idpaasTest");
    book.write(fos);
    fos.close();
    System.out.println("END OF WRITING DATA IN EXCEL");
		
		
	}

}

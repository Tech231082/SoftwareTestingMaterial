package seleniumTutorial;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		Select dropdown=new Select(driver.findElement(By.name("dropdown")));
		//dropdown.selectByValue("ddperformance");
		//dropdown.selectByVisibleText("Performance Testing");
		dropdown.selectByIndex(2);
		//dropdown.deselectByIndex(2);
		WebElement chkbox=driver.findElement(By.name("checkboxes[]"));
		chkbox.click();
		WebElement radio=driver.findElement(By.name("radioselenium"));
		radio.click();
		Select multiselect=new Select(driver.findElement(By.name("multipleselect[]")));
		multiselect.selectByIndex(3);
		//multiselect.selectByValue("msperformance");
		//multiselect.selectByVisibleText("Selenium");
		//multiselect.getAllSelectedOptions();
		multiselect.getFirstSelectedOption();
		//multiselect.deselectAll();
		WebElement bday=driver.findElement(By.name("bday"));
		bday.sendKeys("10-23-1982");
		WebElement text=driver.findElement(By.name("comments"));
		text.sendKeys("Hello Testing world");
		WebElement uploadfile=driver.findElement(By.name("filename"));
		uploadfile.sendKeys("C:\\\\uploadfile\\\\guru99id&pass.txt");
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/table/tbody/tr[1]/th[1]"));
		List  col = driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/table/tbody/tr[1]/th[1]"));
	      System.out.println("No of cols are : " +col.size()); 
	      String innerText1 = driver.findElement(
					By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/table/tbody/tr[2]/td[2]")).getText(); 	
			        System.out.println(innerText1);  
			        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
			        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			        driver.switchTo().window(tabs.get(0));

	}

}

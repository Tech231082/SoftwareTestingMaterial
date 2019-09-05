package tutorialsPoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedWaitQMantra {

	public static void main(String[] args) throws InterruptedException
	  {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		  
		 String ExpectedTitle = "Demo QaMantra Page";
		  
		 String aTitle = "" ;
		 driver.get("http://www.qamantra.com/2018/01/how-to-use-explicit-and-implicit-wait.html" );
		 aTitle = driver.getTitle();
		  
		 //compare the actual title with the expected title
		  
		 if (aTitle.equals(ExpectedTitle))
		  
		 {
		  
		 System.out.println( "Test Passed") ;
		  
		 }
		  
		 else {
		  
		 System.out.println( "Test Failed" );
		  
		 }
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		 WebElement Qamantra=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='widget-content popular-posts'])[1]")));
		 Qamantra.click();
		 
	
	}


	}
	



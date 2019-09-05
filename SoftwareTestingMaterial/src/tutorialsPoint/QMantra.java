package tutorialsPoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QMantra {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.qamantra.com/2018/01/how-to-use-explicit-and-implicit-wait.html" );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ExpectedTitle = "Demo QaMantra Page";
		 
		 String aTitle = "" ;
		 aTitle = driver.getTitle();
		 if(ExpectedTitle.equals(aTitle)) {
			 System.out.println("Test Passed");
		 }else {
			 System.out.println("Test Failed");
		 }
			 
			 

	}

}

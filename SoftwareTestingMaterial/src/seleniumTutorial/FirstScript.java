package seleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 //Declaration of variables
		 String url = "http://softwaretestingmaterial.com";
		 String expectedTitle = "Software Testing Material";
		 String actualTitle = null;
		 driver.navigate().to("http://softwaretestingmaterial.com");;
		 actualTitle=driver.getTitle();
		 System.out.println(actualTitle);
		 if(actualTitle.contentEquals(expectedTitle)) {
			 System.out.println("Test passed");		
			 System.out.println(expectedTitle);
			 
		 }
		 else {
			 System.out.println("Test failed");
			 System.out.println(expectedTitle);
		 }
				 

	}

}

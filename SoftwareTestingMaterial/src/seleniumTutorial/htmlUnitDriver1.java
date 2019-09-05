package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlUnitDriver1 {

	public static void main(String[] args) {
		WebDriver driver =new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
		//Navigate to ArtOfTesting.com		
		driver.get("http://www.artoftesting.com");
		
		//Printing page title
		System.out.println(driver.getTitle());

	}

}

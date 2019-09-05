package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerMainClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver); 
		EventCapture eCapture = new EventCapture();
		//Registering with EventFiringWebDriver
        //Register method allows to register our implementation of WebDriverEventListner to listen to the WebDriver events
         eventHandler.register(eCapture); 
        //navigating to the webpage "www.softwaretestingmaterial.com"
         eventHandler.navigate().to("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/"); 
         for(int i=0; i<=2;i++){
        	  try{
         eventHandler.findElement(By.id("email")).sendKeys("asdsadsa");
         break;
        	  }
        	  catch(Exception e){
        		     System.out.println(e.getMessage());
        		  }
         }
        	  
         //navigating to the webpage "www.softwaretestingmaterial.com/category/selenium/"
         eventHandler.navigate().to("https://www.softwaretestingmaterial.com/agile-testing-interview-questions/"); 
         //navigating back to the first page
         eventHandler.navigate().back();
         eventHandler.quit();
                        //Unregister allows to detach
         eventHandler.unregister(eCapture);
         System.out.println("End of Listners Class");
       

	

	}
}

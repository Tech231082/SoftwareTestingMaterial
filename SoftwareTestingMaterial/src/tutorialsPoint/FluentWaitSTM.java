package tutorialsPoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Function;

public class FluentWaitSTM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		 driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		 
		 
		 FluentWait wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(30, TimeUnit.SECONDS)
		        .pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
		 
		 WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		 public WebElement apply(WebDriver driver) {
		 WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
		 String getTextOnPage = element.getText();
		 if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
		 System.out.println(getTextOnPage);
		 return element;
		 }else{
		 System.out.println("FluentWait Failed");
		 return null;
		 }
		 }
		 });
		 }
		}

	

		 

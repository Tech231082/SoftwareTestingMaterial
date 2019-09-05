package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class ScrollWebpage {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Buddha");
		WebElement button=driver.findElement(By.className("vh79eN"));
		button.click();
		//Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2500)");
		WebElement pageNumberdisplayer = (new WebDriverWait(driver, 10)).until
		          (ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.row")));
		//Verifying that page got scrolled  and "page-2" text is visible now 
		//and more products become visible
		Assert.assertEquals(pageNumberdisplayer.getText(), "Page: 2");
	

	}

}

package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBackForward {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		Thread.sleep(1000);
		WebElement artOfTestingLogo = driver.findElement(By.cssSelector("div.navbar-header"));
		artOfTestingLogo.click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

	}

}

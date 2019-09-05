package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		Actions action = new Actions(driver);
		WebElement fname=driver.findElement(By.name("firstname"));
		action.moveToElement(fname).perform();
		String title=driver.getTitle();
		System.out.println(title);
		//String pageSource=driver.getPageSource();
		//System.out.println(pageSource);
		String toolTipText = fname.getAttribute("title");
		System.out.println(toolTipText);
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links);
		

	}

}

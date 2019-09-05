package seleniumTutorial;

import java.util.Collection;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookie {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		driver = new FirefoxDriver();
		

	}
	public  Set<Cookie> printAllCookies() {
		Collection<org.openqa.selenium.Cookie> cookies=   driver.manage().getCookies();
		return (Set<Cookie>) cookies;
        }

}

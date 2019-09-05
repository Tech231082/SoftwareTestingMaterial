package tutorialsPoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.calculator.net/");
		driver.findElement(By.linkText("Percentage Calculator")).click();
		driver.findElement(By.id("cpar1")).click();

	}

}

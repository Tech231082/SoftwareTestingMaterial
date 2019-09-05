package listeners;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowResize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		int height=400;
		int width=600;
		Dimension dimension=new Dimension(width,height);
		driver.manage().window().setSize(dimension);
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(0,-1000));
		//driver.close();

	}

}

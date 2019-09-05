package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UploadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("Sush");
		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("Goyat");
		driver.findElement(By.name("chkbox")).click();
		driver.findElement(By.name("female")).click();
		WebElement age=driver.findElement(By.name("age"));
		age.sendKeys("35");
		WebElement bday=driver.findElement(By.name("bday"));
		bday.sendKeys("1982-10-23");
		Select id=new Select(driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/article/div[2]/div[1]/form/select")));
		id.selectByVisibleText("Passport");
		WebElement country=driver.findElement(By.name("country"));
		country.sendKeys("India");
		WebElement browse=driver.findElement(By.id("uploadfile"));
		browse.sendKeys("C:\\uploadfile\\guru99id&pass.txt");
		

	}

}

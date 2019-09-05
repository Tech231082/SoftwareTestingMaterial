package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		////*[@id="customers"]/tbody/tr[2]/td[1]
		////*[@id="customers"]/tbody/tr[3]/td[1]
		////*[@id="customers"]/tbody/tr[7]/td[1]
		
		////*[@id="customers"]/tbody/tr[3]/td[2]
		////*[@id="customers"]/tbody/tr[7]/td[2]
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String before_xpath="[@id=\"customers\"]/tbody/tr[";
		String middle_xpath="]/td[";
		
		for(int i=2;i<7;i++) {
			for(int j=1;j<3;j++) {
				String actual_xpath=before_xpath+i+middle_xpath+j+"]";
				System.out.println(driver.findElement(By.xpath(actual_xpath)).getText());
			}
		}

	}

}

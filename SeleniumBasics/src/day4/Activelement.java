package day4;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Activelement {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
     //  WebDriver driver=SetUp("Chrome","https://demo.vtiger.com/vtigercrm/index.php\"");
       // driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	WebDriver driver=seleniumUtil.setUp("Chrome","https://demo.vtiger.com/vtigercrm/index.php");
	 WebElement element=driver.switchTo().activeElement();
	  element.clear();
	String value=  element.getAttribute("placeholder");
	  String expectedValue="Username";
		System.out.println("is mouse pointer on username input field? "+value.equals(expectedValue));
		element.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin",Keys.ENTER);
	}

}

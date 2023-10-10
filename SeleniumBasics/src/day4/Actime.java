package day4;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
     WebElement element= driver.switchTo().activeElement();
         String value= element.getAttribute("placeholder");
         String expectedvalue="Username";
         System.out.println("is mouse pointer on username input field?"+value.equals(expectedvalue));
         element.sendKeys("admin",Keys.TAB);
         driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
         
      
	}

}

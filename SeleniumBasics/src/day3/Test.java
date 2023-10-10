package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://live.brandip.com/name-for-sale/public/admin/login");

        WebElement usernameInput = driver.findElement(By.id("email"));
        usernameInput.clear();        
        usernameInput.sendKeys("admin@example.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
	    passwordInput.clear();
	    passwordInput.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-xl.btn-primary"));
  
        loginButton.click();
      
    }



}

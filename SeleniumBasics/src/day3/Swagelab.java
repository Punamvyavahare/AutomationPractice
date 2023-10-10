package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Swagelab {
	        public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",  "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.saucedemo.com/");
			 
			 WebElement username=driver.findElement(By.id("user-name"));
			 username.sendKeys("standard_user");
			 
			 WebElement passwordname=driver.findElement(By.id("password"));
			 
			 passwordname.sendKeys("secret_sauce");
			 
			 WebElement loginButton=driver.findElement(By.id("login-button"));
			 
			 loginButton.click();
			 
			 
			

		}
	
	}



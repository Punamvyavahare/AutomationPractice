package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm  {

	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement usernameInput = driver.findElement(By.xpath("(//input[@name='username'])"));
        usernameInput.clear();        
        usernameInput.sendKeys("Admin");

        WebElement passwordInput = driver.findElement(By.xpath("(//input[@name='password'])"));
        passwordInput.clear();        
        passwordInput.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])"));
        loginButton.click();
        
       WebElement logout=driver.findElement(By.className(" \"oxd-userdropdown-link\""));
       logout.click();
       
      
    }



}



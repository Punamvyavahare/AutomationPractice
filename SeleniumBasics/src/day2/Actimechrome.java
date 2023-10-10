package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actimechrome {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Navigate to the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userName=driver.findElement(By.xpath("username"));
		
		userName.sendKeys(" Admin");
		
		driver.findElement(By.xpath("passward")).sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.xpath("button"));
		loginButton.click();

        // You can add further actions for the logged-in page here

        // Close the browser
       // driver.quit();
    }
}

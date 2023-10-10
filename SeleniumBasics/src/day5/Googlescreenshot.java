package day5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class Googlescreenshot{
    public static void main(String[] args) throws IOException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Define an explicit wait with a condition (e.g., wait for the Google logo to be visible)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement googleLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hplogo")));

        // Take a screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshotFile = ts.getScreenshotAs(OutputType.FILE);

        // Define the destination file path
        String filePath = "C:/Path/To/Your/Directory/google.png";


        // Copy the screenshot to the specified path
        Files.copy(screenshotFile.toPath(), new File(filePath).toPath());

        // Close the WebDriver
        driver.quit();

        System.out.println("Screenshot saved to: " + filePath);
    }
}

package day1myprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Openfirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Acceleretion -Testing\\workspace\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://chat.openai.com/");
	}
}

package day1myprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//get current title from application
		System.out.println("title: "+driver.getTitle());
		//get current url from application
		System.out.println("current url: "+driver.getCurrentUrl());
		//get page source
		String sourceCode=driver.getPageSource();
		//System.out.println("Source code: "+sourceCode);
		System.out.println("Source code lenght: "+sourceCode.length());
		//close browser
		driver.close();

	}

}
package day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Genericopenbrower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

			
				
				//ChromeDriver driver=new ChromeDriver();
						//or
				WebDriver driver=new ChromeDriver();
				//enter application URL
				driver.get("https://www.google.com");
				//get current title from application
				System.out.println("title: "+driver.getTitle());
				//get current URL from application
				System.out.println("current url: "+driver.getCurrentUrl());
				//get page source
				String sourceCode=driver.getPageSource();
				//System.out.println("Source code: "+sourceCode);
				System.out.println("Source code lenght: "+sourceCode.length());
				//close browser
				driver.close();

			}

	
}

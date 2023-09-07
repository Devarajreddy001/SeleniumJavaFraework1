package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Googlesearchpageobjects;

public class Googlesearchpagetest {

	WebDriver driver=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Googlesearchpage();

	}
	
 public static void Googlesearchpage() {
	 WebDriverManager.chromedriver().setup();

		ChromeDriver driver= new ChromeDriver();
		//gotot google .com
		
		
		Googlesearchpageobjects pageobject= new Googlesearchpageobjects(driver);
		driver.get("https://google.com");
		pageobject.settextinsearch("auto");
		pageobject.Clicksearch();
		driver.close();
 }
 
}

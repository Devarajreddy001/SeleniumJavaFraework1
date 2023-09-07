package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlesschromedemo {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
setup();
	}
	
	
	public static void setup() {
		WebDriver driver= null;
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless");
	

		 driver= new ChromeDriver(options);
		 driver.manage().window().maximize();
		 
		// ChromeOptions options = new ChromeOptions();
		
		 driver.get("https:google.com");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.name("q")).sendKeys("auto");
		 driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		 
		 driver.close();
		 driver.quit();
		 System.out.println("completed");
		 
	}

}

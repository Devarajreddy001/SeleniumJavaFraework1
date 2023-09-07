package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumwaitdemo {
	
	
	WebDriver driver= new ChromeDriver();
	public static void main (String[]  args) {
		seleniumWaits();
	}
	
	 
	public static void seleniumWaits() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();
		

		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://google.com");
		 driver.findElement(By.xpath(" //*[@name='q']")).sendKeys("Automation step by step");
		 driver.findElement(By.xpath(" //*[@name='btnK']")).sendKeys(Keys.RETURN);
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("abcde")));
		 driver.findElement(By.name("abcd")).click();
		 driver.close();
		 driver.quit();
	}

}

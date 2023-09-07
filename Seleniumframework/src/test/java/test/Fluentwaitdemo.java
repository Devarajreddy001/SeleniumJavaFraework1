package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwaitdemo {

	
	WebDriver driver= null;
	
	public static void main (String [] args) throws Exception {
		setupTest();
	}
	public static void setupTest() throws Exception {

		WebDriver driver= null;
		WebDriverManager.chromedriver().setup();

		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://google.com");
		 
		 driver.findElement(By.name("q")).sendKeys("abcd");
		 
		 driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		// driver.findElement(By.linkText(" /url?sa=t&source=web&rct=j&opi=89978449&url=https://www.dailymotion.com/video/x2ym8r9&ved=2ahUKEwjulfWal5SBAxVlgVYBHZEzC004ChC3AnoECAwQAg")).click();
		 
		 
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L))
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	WebElement LinkElement= driver.findElement(By.xpath(" //*[@class='nhaZ2c'][1]"));
		    	if (LinkElement.isEnabled()) {
		    		
		    		System.out.println("Element found");
		    		
		    	}
		    	return LinkElement;
		     }
		   });
	
		   
		 
		 driver.close();
		 driver.quit();
		
		foo.click();
	}

}

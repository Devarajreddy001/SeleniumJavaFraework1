package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Propertiesfile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googlsearchpage;
public class Testngdemo {

	WebDriver driver=null;
	public static String browserName=null;
	
	@BeforeTest
	public void setupTest() {
		String project= System.getProperty("user.dir");
		Propertiesfile.getproperties();
		if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", project+"/Drivers/Chromedriver/chromedriver.exe");

		 driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", project+"/Drivers/Chromedriver/chromedriver.exe");

		 driver= new FirefoxDriver();
		
		}
		
		
	}


	@Test
	public  void googlesearch() {
		
		
		driver.get("https://google.com");
		
	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Automation");
	driver.findElement(By.xpath(" //*[@name='q']")).sendKeys(Keys.RETURN);
		
		
	}
	
	@AfterTest
	public void teardowntest() {
		driver.close();
		driver.quit();
		System.out.println("completed succesfully");
	}
}

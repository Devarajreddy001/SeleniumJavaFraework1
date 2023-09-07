package test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googlsearchpage;
public class Testngdemo2 {

	static Properties prop= new Properties();
	static String projectpath= System.getProperty("user.dir");
	WebDriver driver=null;
	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();

		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		
		
		
	}


	@Test
	public  void googlesearch2() {
		
		try {
			;
			
			InputStream input= new FileInputStream(projectpath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser=prop.getProperty("url");
			String user=prop.getProperty("username");
			
			driver.get(browser);
			driver.findElement(By.xpath("//*[@class='button button-primary shadow mt-3 mb-4'][1]")).click();
			driver.findElement(By.xpath(" //*[@name='username']")).sendKeys(user);
			driver.findElement(By.xpath(" //*[@type='submit']")).click();
			WebElement e=  driver.findElement(By.xpath("//*[@class='btn-wrapper upload-btn']"));
			e.click();
			
			e.sendKeys("C:\\Users\\pdevaraj\\Desktop\\dev.pdf");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	
	 
		

		
		
		

		

		
		

		
		
	}
	
	@AfterTest
	public void teardowntest() {
		//driver.close();
		//driver.quit();
		System.out.println("completed succesfully");
		
	}
}

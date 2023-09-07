package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	
	
	WebDriver driver=null;
	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();

		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	
	/*public void test() throws IOException 
	{
		driver.get("https://amazon.in");
		
		//File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Files.copy(f, new File("C:\\Users\\pdevaraj\\Desktop\\Project\\amazonscreenshot.png"));
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		File trg= new File ("C:\\Users\\pdevaraj\\Desktop\\Project\\amazonscreenshot1.png");
		FileUtils.copyFile(src, trg);}*/
		
		
	
	
	//takesscreenshotof webelement
	
	public void test1() throws IOException 
	{
		driver.get("https://amazon.in");
		
		//File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Files.copy(f, new File("C:\\Users\\pdevaraj\\Desktop\\Project\\amazonscreenshot.png"));
		
		WebElement section = driver.findElement(By.xpath("//*[@class='nav-logo-link nav-progressive-attribute'] "));
		
		//TakesScreenshot ts= (TakesScreenshot)driver;
		
		File src= section.getScreenshotAs(OutputType.FILE);
		
		File trg= new File ("C:\\Users\\pdevaraj\\Desktop\\Project\\amazonscreenshot4.png");
		FileUtils.copyFile(src, trg);
		
		
	}
	
	@AfterTest
	public void teardowntest() {
		driver.close();
		driver.quit();
		System.out.println("completed succesfully");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extendreports {
	
	private static WebDriver driver= null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver= new ChromeDriver();
		
	 
		
		ExtentSparkReporter html= new ExtentSparkReporter("extentreports.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(html);
		
		ExtentTest test1 = extent.createTest("google search test one", "this is to validate google functionality");
		
		test1.log(Status.INFO, "starting case");
		
		
		driver.get("https://google.com");
		
		test1.pass("navigated to google");
         driver.findElement(By.name("q")).sendKeys("Automation");
         
        test1.pass("entered google");
         driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
         test1.pass("clicked enter");
         
         driver.close();
         driver.quit();
         
         test1.pass("closed the browser");
         
         test1.pass("completed");
         
         
         //calling flush statement will write everything to the log file
         
         extent.flush();
	}

}

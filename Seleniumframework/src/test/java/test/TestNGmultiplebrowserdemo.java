package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGmultiplebrowserdemo {
	
	WebDriver driver= null;
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) 
	{
		if(browserName.equalsIgnoreCase("chrome"))
				{
			WebDriverManager.chromedriver().setup();

			 driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			 driver= new FirefoxDriver();
					 }
		else if (browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
		}
	}
@Test
public void test() throws Exception {
	driver.get("https://google.com");
	Thread.sleep(4000);
}

@AfterTest
public void teardown() {
	driver.close();
	System.out.println("completed");
}
	
}

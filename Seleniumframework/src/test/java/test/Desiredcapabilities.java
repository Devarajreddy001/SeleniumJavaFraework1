package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Desiredcapabilities {

	static WebDriver driver=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities caps= new DesiredCapabilities();
		System.out.println(caps.getCapabilityNames());
		 driver= new ChromeDriver();
		 
		 driver.get("https://google.com");
			
			driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Automation");
			driver.findElement(By.xpath(" //*[@name='q']")).sendKeys(Keys.RETURN);
				
			driver.close();
			driver.quit();
		
	}

}

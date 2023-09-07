package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItdemo {
	
	public static void main (String[] Args) throws IOException, InterruptedException {
		test();
		
	}
	
	public static void test() throws IOException, InterruptedException {
		WebDriver driver= null;
		
		WebDriverManager.chromedriver().setup();

		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(" https://www.file.io/");
		 driver.findElement(By.xpath(" //*[@class='css-zpjtsm e12cce780']")).click();
		 Runtime.getRuntime().exec("Documents:\\fileuploadscript.exe");
		 Thread.sleep(3000);
		 driver.close();
		 driver.quit();
		
	}

}

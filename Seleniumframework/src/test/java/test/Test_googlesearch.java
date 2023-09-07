package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		googlesearch();
	}

	public static void googlesearch() {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver= new ChromeDriver();
		//gotot google .com
		
		driver.get("https://google.com");
		
		//enter text in search button
		
		WebElement textfield= driver.findElement(By.xpath("//*[@class='gLFyf']"));
		new Actions(driver)
        .sendKeys(textfield, "Selenium!").perform();
		
		driver.findElement(By.xpath(" //*[@name='q']")).sendKeys(Keys.RETURN);
		
	}
}

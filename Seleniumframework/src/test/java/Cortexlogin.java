import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cortexlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://cortexuat.acr.org" );
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='button button-primary shadow mt-3 mb-4'][1] ")).click();
		driver.findElement(By.xpath(" //*[@id='idp-discovery-username']")).sendKeys("testdxit1");
		driver.findElement(By.xpath(" //*[@type='submit']")).click();
		
		WebElement password= driver.findElement(By.xpath(" //*[@id='okta-signin-password']"));
		new Actions(driver)
		.click()
		.sendKeys(password, "Titp42023!").perform();
		
		driver.findElement(By.xpath(" //*[@type='submit']")).click();
		
		
		

	}

}

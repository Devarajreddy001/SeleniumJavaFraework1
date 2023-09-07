import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumdrivermanager {

	@SuppressWarnings("deprecation")
	public static <WebElement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://sso.acr.org/signin");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='okta-signin-username']")).sendKeys("testdxit1");
        driver.findElement(By.xpath(" //*[@id='okta-signin-password']")).sendKeys("Titp42023!");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	  
	    driver.switchTo().newWindow(WindowType.TAB);// open a new tab in the window
	    
	    driver.navigate().to("https://cortexuat.acr.org");
	    
	   
	    driver.findElement(By.xpath("//*[@class='button button-primary shadow mt-3 mb-4'][1]")).click();
	    
	    driver.switchTo().newWindow(WindowType.WINDOW);//opens new window
	    driver.navigate().to("https://cortex.acr.org");
	
	    
	    String newWindow = driver.getWindowHandle();
	    
	    ArrayList tabs = new ArrayList(driver.getWindowHandles());
	    System.out.println(tabs.size());
	    
	    driver.switchTo().window((String) tabs.get(0));
	    
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	    driver.switchTo().window((String) tabs.get(1));
	    
	    /*JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("window.scrollBy(0,200)", "");
        
		driver.findElement(By.xpath(" //*[@data-se='o-form-input-password']")).clear();
		driver.findElement(By.xpath(" //*[@data-se='o-form-input-password']")).click();
		driver.findElement(By.xpath(" //*[@data-se='o-form-input-password']")).sendKeys("Titp42023!");
		
		 driver.findElement(By.xpath("//*[@type='submit']")).click();*/
	
	

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browsertest {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectpath= System.getProperty("user.dir");
		
		System.out.println("projectpath: "+projectpath);
		
System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\pdevaraj\\eclipse-workspace1\\Seleniumframework\\Drivers\\Chromedriver\\chromedriver");
		WebDriver  driver= new ChromeDriver();
		
		driver.get("https://cortex.acr.org");
		

	}

}

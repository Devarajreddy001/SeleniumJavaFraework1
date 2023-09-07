package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlsearchpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	

	private static WebElement element= null;

	public static WebElement textbox_search (WebDriver driver)
	
	{
		 element= driver.findElement(By.xpath(" //*[@name='q']"));
		return element;
	}

	public static WebElement button_search (WebDriver driver)
	
	{
		 element= driver.findElement(By.xpath(" //*[@name='q']"));
		return element;
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Googlesearchpageobjects {
	
	WebDriver driver=null;
	

	
		// TODO Auto-generated method stub
		
		By textbox_search= By.xpath("//*[@name='q'] ");
		By button_search= By.xpath("//*[@name='btnK'] ");
		
		public Googlesearchpageobjects(WebDriver driver) 
		{
			this.driver=driver;
		}
		
		public void settextinsearch(String text) 
		{
			driver.findElement(textbox_search).sendKeys(text);
			
		}
		public void Clicksearch() 
		{
			driver.findElement(button_search).click();
			
		}
		
		
		public static void main(String[] args)
		{
			
	}




}

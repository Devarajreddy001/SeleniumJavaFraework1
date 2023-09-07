package Utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldataprovider {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String excelPath= "C:\\Users\\pdevaraj\\eclipse-workspace1\\Seleniumframework\\Excel\\data.xlsx";
        		 testdata(excelPath, "Sheet1");
        		 
        		 
	}
	
	@BeforeTest
	 public void setup() {
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver= new ChromeDriver();
	}
	
	@Test(dataProvider="test1data")
	
	
	public void test1(String username, String password) 
	{
		System.out.println(username + " | " + password);
	}
	
	@DataProvider(name="test1data")
	public static Object getData() {
		String excelPath= "C:\\Users\\pdevaraj\\eclipse-workspace1\\Seleniumframework\\Excel\\data.xlsx";
		 Object data= testdata(excelPath, "Sheet1");
		 return data;
	}
	
	
	public  static  Object testdata(String excelPath, String sheetName) 
	{
		Excelutils excel= new Excelutils(excelPath,sheetName);
		
		int rowcount= excel.getRowCount();
		int colcount= excel.getcolCount();
		
		Object data [][]= new Object[rowcount-1][colcount];
		
	 for (int i=1; i<rowcount; i++)	{
		 
		 for (int j=0; j<colcount; j++) {
			 
			 String celldata= Excelutils.getcelldataString(i,j);
			 System.out.println(celldata);
			 data [i-1][j]=celldata;
		 }
		 return data;
		
	 }
	return data;
	}

}

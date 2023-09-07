package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Test
public class Extentreportstestng {
	ExtentSparkReporter html;

	ExtentReports extents;
	
	@BeforeTest
	public void setup()
	{
		 html= new ExtentSparkReporter("extentreports1.html");
		
	 extents= new ExtentReports();
		
		extents.attachReporter(html);
	}
	
	public void test1()
{
	ExtentTest test= extents.createTest("MyFirtstest", "simpledescription");
	test.log(Status.INFO, "This step shows usage of log(status, description)");
	test.info("this step shows info of usage info (details)");
test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	test.addScreenCaptureFromPath("screenshot.png");
}
	public void test2()
	{
		ExtentTest test= extents.createTest("MyFirtstest", "simpledescription");
		test.log(Status.INFO, "This step shows usage of log(status, description)");
		test.info("this step shows info of usage info (details)");
	test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}
		
	@AfterTest
	public void teardown() 
	{
		extents.flush();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

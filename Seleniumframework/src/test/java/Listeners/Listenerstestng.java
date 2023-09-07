package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;

public class Listenerstestng implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test started : "+result.getName());
		
		
	}
	
public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test success : "+result.getName());
		
		
	}

public void onTestFailure(ITestResult result) {
	
	System.out.println("Test failed: "+result.getName());
	
}

public void onTestSkipped(ITestResult result) {
	
	System.out.println("Test skipped : "+result.getName());
	
}


public void onFinish(ITestResult output) {
	
	System.out.println("Test finished : "+output.getName());
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

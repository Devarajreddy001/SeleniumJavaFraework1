package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGreyryfailed {

	@Test
	public void test1() {
		System.out.println("I am inside test1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test2");
	//nt i=1/0;
		
		
	}
	@Test
	public void test3() {
		System.out.println("I am inside Test3");
		Assert.assertTrue(0>1);
	}
	
	

}

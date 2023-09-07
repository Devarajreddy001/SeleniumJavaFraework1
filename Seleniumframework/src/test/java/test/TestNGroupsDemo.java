package test;

import org.testng.annotations.Test;

@Test(groups= {"sanity"})

public class TestNGroupsDemo {

	
	@Test(groups= {"sanity"})
	public void test1() 
	{
		System.out.println("This is test 1");
	}
	
	@Test(groups= {"sanity","smoke"})
    public void test2() 
    {
		System.out.println("This is test2 ");
	}
	
	@Test (groups= {"smoke","regression"})
    public void test3() 
    {
		System.out.println("This is test3");
   	}
	
}

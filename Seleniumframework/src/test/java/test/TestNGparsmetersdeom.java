package test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparsmetersdeom {
	
	@Test
	@Parameters({"thename"})
	public void test (@Optional()String name)
	{
System.out.println("name is :" + name);		
	}

}

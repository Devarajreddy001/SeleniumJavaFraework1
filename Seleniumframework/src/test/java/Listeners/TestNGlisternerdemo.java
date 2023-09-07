package Listeners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.SkipException;
@Listeners(Listenerstestng.class)
public class TestNGlisternerdemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 4");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test 5");
		
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 6");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

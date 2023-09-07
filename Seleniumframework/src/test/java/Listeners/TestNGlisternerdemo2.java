package Listeners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenerstestng.class)
public class TestNGlisternerdemo2 {

	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

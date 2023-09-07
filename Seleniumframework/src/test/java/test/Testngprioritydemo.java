package test;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Testngprioritydemo {

	@Test(priority = 1)
	public void one() {
		System.out.println("I am inside test1");
	}
	@Test(priority = 0)
	public void two() {
		System.out.println("I am inside test2");
	}
	@Test(priority = 0)
	public void three() {
		System.out.println("I am inside test4");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package main;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoOne {
	@AfterMethod
	public void getNames() {
		System.out.println("after method");
	}
	
	@BeforeMethod
	public void getCarDetails() {
		System.out.println("Before Method");
	}
	
	@Test(groups= {"run after every build"}, enabled=false)
	public void getVanDetails() {
		System.out.println("should be skipped");
	}
	
	@Test
	public void setNames() {
		System.out.println("methods in between");
	}
}

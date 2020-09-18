package main;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void setDriver() {
		System.out.println("driver path is set");
	}
	
	
	@Test(groups= {"run after every build"})
	public void mobilerun() {
		System.out.println("mobile run");
	}
	
	@Test
	public void webrun() {
		System.out.println("web run");
	}
	
	@Test
	public void apirun() {
		System.out.println("api run");
	}
	
	@AfterTest
	public void closeDriver() {
		System.out.println("driver is closed");
	}
	
}

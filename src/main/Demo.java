package main;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo {
	@BeforeSuite
	public static void Sample() {
		System.out.println("before the suite");
	}
	
	@AfterSuite
	public static void Sample1() {
		System.out.println("after the suite");
	}
	
	@Test(groups= {"run after every build"})
	public static void buildSetup() {
		System.out.println("build setup");
	}
	
}

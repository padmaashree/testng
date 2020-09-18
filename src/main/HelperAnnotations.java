package main;

import org.testng.annotations.Test;

public class HelperAnnotations {
	
	@Test(dependsOnMethods = { "webgrouprun", "apirungroup"})
	public void groupmobilerun() {
		System.out.println("group mobile run");
	}
	
	@Test
	public void webgrouprun() {
		System.out.println("group web run");
	}
	
	@Test
	public void apirungroup() {
		System.out.println("group api run");
	}
	

}

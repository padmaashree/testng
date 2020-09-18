package main;

import org.testng.annotations.Test;

public class GroupsExample {
	
	
	
	@Test(groups= {"run after every build"})
	public void groupmobilerun() {
		System.out.println("group mobile run");
	}
	
	@Test
	public void webgrouprun() {
		System.out.println("group web run");
	}
	
	@Test(groups= {"run after every build"})
	public void apirungroup() {
		System.out.println("group api run");
	}
	
	
}

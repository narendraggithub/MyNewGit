package com.test;

import org.testng.annotations.Test;

public class TestNGfeatures {

	
	
	@Test
	public void loginTest() {
		System.out.println("loginTest");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void verifyTest() {
		System.out.println("verifyTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchTest() {
		System.out.println("searchTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegloginTest() {
		System.out.println("RegisterTest");
	}
}

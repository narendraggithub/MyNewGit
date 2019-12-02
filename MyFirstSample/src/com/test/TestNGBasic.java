package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	
	
	//Pre-condition annotations 
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite---setup system property for chrome");
	}
	
		
	@BeforeTest
	public void launchbrowser() {
		System.out.println("@BeforeTest---Launch the browser");
	}
	
	@BeforeMethod
	public void entesiteURL() {
		System.out.println("@BeforeMethod---URL for the site entered");
	}
	
	//Testcase annotations
	@Test(priority=1)
	public void LoginPage() {
		System.out.println("@Test1---Login to the website");
	}
	
	@Test(priority=3)
	public void SearchPage() {
		System.out.println("@Test3---Search Elements");
	}
	
	@Test(priority=2)
	public void Registration() {
		System.out.println("@Test2---Register new accounts");
	}
	
	//Post condition annotations
	@AfterMethod
	public void Logout() {
		System.out.println("@AfterMethod---Logout from the site");
	}
	
	@AfterTest
	public void Closebrowser() {
		System.out.println("@AfterTest---Close the browser");
	}

	@AfterSuite
	public void DeleteCookies() {
		System.out.println("@AfterSuite---Delete Cookies");
	}
}

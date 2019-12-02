package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
		String baseurl ="https:www.google.com/";
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//wait for page load
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //wait for web elements in the page
		driver.get(baseurl);
		

	}
	
	@Test (priority=1,groups="title")
	public void verifyTitle() {
		
		String title =driver.getTitle();
		System.out.println(title);
		
	}

	@Test(priority=2,groups="logo")
	public void verifylogo() {
		
		boolean b1=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(b1);
	}
	
	@Test(priority=3,groups="links")
	public void checkemail() {
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		boolean b2=driver.findElement(By.xpath("//img[@class='gb_na']")).isDisplayed();
		System.out.println(b2);
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	
	
	
	
	

}

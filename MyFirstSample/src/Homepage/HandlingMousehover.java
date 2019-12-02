package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMousehover {

	public static void main(String[] args) throws InterruptedException {
	//Handling Mouse Movements
	
		
		String baseurl ="https://www.spicejet.com/";
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.get(baseurl);	
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform(); //Mousehover code
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("SpiceBiz")).click(); //Mouseover and click SpiceBiz
		
		
				
	}

}

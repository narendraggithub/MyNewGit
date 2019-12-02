package Homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		String baseurl ="https://ui.cogmento.com/";
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//wait for page load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait for web elements in the page				
		driver.get(baseurl);
		
		driver.findElement(By.name("email")).sendKeys("mailnaren2012@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		//Method 1:  To select a row in the web table
		
		
		
		
		
		
		
		
		
		
		

	}

}

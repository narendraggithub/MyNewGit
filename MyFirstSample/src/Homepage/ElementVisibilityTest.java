package Homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
	
		String baseurl ="https://register.freecrm.com/register/";
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get(baseurl);
		
		//1.Verify IsDispayed()

		boolean b1= driver.findElement(By.xpath("//button[@name='action']")).isDisplayed();
		
		System.out.println(b1);// true
		
		//2.Verify IsEnabled()
		

		boolean b2= driver.findElement(By.xpath("//button[@name='action']")).isEnabled();
		
		System.out.println(b2);// true
		
		//3.Verify IsSelected() only applicable for Radiobutton,checkbox and dropdown
		
		
		
	
	}

}

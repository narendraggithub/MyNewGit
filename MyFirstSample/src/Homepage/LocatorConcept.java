package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	
	public static void main(String[] args) {
		
		String baseurl ="https://mail.yahoo.com";
				
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.findElement(By.linkText("Create&nbsp;account")).click();
		
	//	https://mail.yahoo.com
		

	}

}

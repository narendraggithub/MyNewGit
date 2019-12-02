package Homepage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinkcount {

	public static void main(String[] args) {

		String baseurl ="http://www.facebook.com";
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.get(baseurl);
		
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());// displays all the links count in the page
		
		
		for(int i=0; i<linklist.size(); i++)
		{
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
			
		}
		
		
	

	}

}

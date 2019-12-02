package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

//////////////<To Launch Chrome Browser>/////////////////////////////////////////////
		
String projectlocation =System.getProperty("user.dir");
		
System.setProperty("webdriver.chrome.driver",projectlocation+ "\\lib\\chromedriver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.seleniumhq.org/");

	
	
//////////////<To Launch Gecko Browser>/////////////////////////////////////////////
	
//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\Gecko\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//WebDriver driver= new FirefoxDriver();
//driver.get("https://www.seleniumhq.org/");

}

}

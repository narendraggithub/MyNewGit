package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModularCode {

	static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		//short cut key..comments alignment Ctrl I//
	    // To call in sequence we add methods in the Main
		
		SetBrowser ();
		SetBrowserConfig();
		RunTest();
		
	}
	//Set Browser
	//Set BrowserConfig
	//Run Test
		public static void SetBrowser ()
		{
			browser="Firefox";
		}

		public static void SetBrowserConfig()
		{
			if(browser.contains("Chrome")){
				String projectlocation =System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver",projectlocation+ "\\lib\\chromedriver\\chromedriver.exe");
				driver= new ChromeDriver();

			}

			if (browser.contains("Firefox")) {
				String projectlocation =System.getProperty("user.dir");
				System.setProperty("webdriver.gecko.driver",projectlocation+ "\\lib\\geckodriver\\geckodriver.exe");
				driver= new FirefoxDriver();
			}
		}

		public static void RunTest()
		{
			driver.get("https://www.seleniumhq.org/");
			driver.quit();
		}
}

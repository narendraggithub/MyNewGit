package Homepage;

//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotconcept {

	public static void main(String[] args) {
		String baseurl ="http://www.google.com";
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(baseurl);
		

		//Take screen shot and store as a Fileformat
		//File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to the desired location using copy file method
	//	FileUtils.copyFile(src ,new File(“/MyFirstSample/src/Homepage/screenshot1.jpg”));
		
		

	}

}

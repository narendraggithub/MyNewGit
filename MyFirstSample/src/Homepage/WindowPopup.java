package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) {
		
		//Handling Window popup by selenium
		
		String baseurl ="https://html.com/input-type-file/";
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);		
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Selenium\\Notes\\Selenium Process.docx");
		// Always use Sendkeys for selecting windows file
	}

}



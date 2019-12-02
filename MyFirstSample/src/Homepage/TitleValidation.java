package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {
		String projectlocation =System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\lib\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");//Launch URL
		
		String title=driver.getTitle();//get title
		System.out.println(title); //Display title
		
		//Validating the title is correct or not
		
		if (title.equals("Selenium - Web Browser Automation"))
		{
			System.out.println("correct title");

		}
		else
		{
			System.out.println("Incorrect title");
		}
	}

}

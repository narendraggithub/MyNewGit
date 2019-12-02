package Homepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	//Handling Alert Popup (JS Popup) for browser

	public static void main(String[] args) throws InterruptedException {
		
		
		String baseurl ="https://mail.rediff.com/cgi-bin/login.cgi";
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\\\lib\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.findElement(By.name("proceed")).click(); //click go button
		
		Alert alert =driver.switchTo().alert();
		Thread.sleep(5000);
	
		System.out.println(alert.getText());
		 
		String text =alert.getText();
		
		if (text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct alert message");
		}
		else
		{
			System.out.println("Incorrect alert message");
	}
	
	alert.accept();
	


	}
}
		  

// click OK button


//alert.dismiss(); //click if Cancel button appears

	
	


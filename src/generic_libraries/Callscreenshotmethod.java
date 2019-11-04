package generic_libraries;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Callscreenshotmethod {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
        System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		Genericcode_screenshot.getPhoto(driver);
		Thread.sleep(3000);
		
		driver.get("https://www.gmail.com");
		Genericcode_screenshot.getPhoto(driver);
		
		

	}

}

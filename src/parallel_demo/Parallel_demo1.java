package parallel_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallel_demo1 
{
	public WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	@Parameters({"browser"})
	@Test
	public void test_prallel(String browser)
	{
		if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		}else{
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
		}
	}

}

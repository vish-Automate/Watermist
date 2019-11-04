package generic_libraries;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Generic_class implements Auto_constant
{
	
	public WebDriver driver;   // global variable can be accessed anywhere in the class
	
	
	static
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	
	
//	@Parameters({"browser"})
	@BeforeMethod
	public void test_prallel() throws FileNotFoundException, IOException
	{
		String url = Property_Generic.property("./p.properties", "url");
		
//		String iw = Property_Generic.property("./p.properties", "iw");
//	                long L = Long.parseLong(iw);
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		if(browser.equals("firefox"))
//		{
			driver = new FirefoxDriver();
			driver.get(url);
//		}else{
//			driver = new ChromeDriver();
//			driver.get("https://www.google.com");
//		}
	}
	
	
	@AfterMethod
	public void test2(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		if(status==res.FAILURE)                //    if(status==2) 
		{
			Genericcode_screenshot.getPhoto(driver);
		}
		
			driver.close();
		
	}
	
}

package generic_libraries;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic111_class 
{
	
	public WebDriver driver;   // global variable can be accessed anywhere in the class
	
	@BeforeMethod
	public void test1()
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	
	 driver = new FirefoxDriver();
	
	driver.get("https://www.gmail.com/");
	}
	
//	
//	@AfterMethod
//	public void test2()
//	{
//		driver.close();
//		
//	}
	
}

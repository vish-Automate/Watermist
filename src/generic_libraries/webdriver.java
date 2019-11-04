package generic_libraries;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class webdriver {
	
	public void close(WebDriver driver)
	{
		driver.close();
	}
	public void get(WebDriver driver,String val)
	{
		driver.get(val);
	}
	public void getCurrentUrl(WebDriver driver)
	{
		driver.getCurrentUrl();
	}
	public void getPageSource(WebDriver driver)
	{
		driver.getPageSource();
	}
	public void getTitle(WebDriver driver)
	{
		driver.getTitle();
	}
	public void getWindowHandle(WebDriver driver)
	{
		String tab = driver.getWindowHandle();
		System.out.println(tab);
	}
	public ArrayList<String> getWindowHandles(WebDriver driver)
	{
		Set<String> tab = driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>();
		for(String p:tab)
		{
			l.add(p);
		System.out.println(p);
		}
	return l;
	}
	public void switchTo(WebDriver driver,int i)
	{
		Set<String> tab = driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(tab);
		String ind = l.get(i);
		driver.switchTo().window(ind);	
	}
	public void quit(WebDriver driver)
	{
		driver.quit();
	}
	public void back(WebDriver driver)
	{
		driver.navigate().back();
	}
	public void forward(WebDriver driver)
	{
		driver.navigate().forward();
	}
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	
	}
	
}



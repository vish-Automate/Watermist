package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Browser_actions {
	
	public void navigate_refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	public void naviagte_froward(WebDriver driver)
	{
		driver.navigate().forward();
	}
	
	public void navigate_backward(WebDriver driver)
	{
		driver.navigate().back();
	}

	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void minimize(WebDriver driver) throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}
	
	
	public void resize(WebDriver driver, int x, int y)
	{
		Dimension d = new Dimension(x, y);
		driver.manage().window().setSize(d);
	}
	
	public void drag(WebDriver driver, int x, int y)
	{
		Point p = new Point(x, y);
		driver.manage().window().setPosition(p);
	}
	
	public void deleteALLcookies(WebDriver driver)
	{
		driver.manage().deleteAllCookies();
	}
}

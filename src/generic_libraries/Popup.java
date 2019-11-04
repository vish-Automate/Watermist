package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup {
	
	public void Alert_pop(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
			  a.accept();
	}

	public void Alertpopup(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
			  a.dismiss();
	}
	
	
	
	public void file_uploadpopup(WebElement ele, String p)
	{
		ele.sendKeys(p);
	}
	
	public void file_downloadpopup(WebElement ele)
	{
		ele.sendKeys(Keys.ENTER);
	}
	
	
	public void file_download_save(WebElement ele) throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}

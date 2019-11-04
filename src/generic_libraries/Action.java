package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action
{
	Actions act;
	
	
	public Action(WebDriver driver )
	{
		act = new Actions(driver);
	}
	
	
	public void mousehover( WebElement ele)
	{
		act.moveToElement(ele).perform();
	}
	
	
    public void dragandDrop(WebElement source,WebElement target)
    {
    	act.dragAndDrop(source, target).perform();
    	
    }
    
    public void nTab( WebElement ele) throws AWTException
    {
    	Robot r = new Robot();
    	act.contextClick(ele).perform();
    	r.keyPress(KeyEvent.VK_T);
    	r.keyRelease(KeyEvent.VK_T);
    	
    }
    
    public void nWin( WebElement ele) throws AWTException
    {
    	Robot r = new Robot();
    	act.contextClick(ele).perform();
    	r.keyPress(KeyEvent.VK_W);
    	r.keyRelease(KeyEvent.VK_W);
    }
    
    public void nPrinwin(WebElement ele) throws AWTException
    {
    	Robot r = new Robot();
    	
    	act.contextClick(ele).perform();
    	r.keyPress(KeyEvent.VK_P);
    	r.keyRelease(KeyEvent.VK_P);
    }
    
    public void dclick( WebElement ele)
    {
    	
    	act.doubleClick(ele).perform();
    }
    
}


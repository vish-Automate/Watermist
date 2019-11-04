package generic_libraries;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Webele {
	public void clear(WebElement ele)
	{
		ele.clear();
	}
	public void click(WebElement ele)
	{
		ele.click();
	}
	public void getAttribute(WebElement ele,String val)
	{
		ele.getAttribute(val);
	}
	public void getCssValue(WebElement ele,String val)
	{
		ele.getCssValue(val);
	}
	public Point getLocation(WebElement ele)
	{
		Point e = ele.getLocation();
		System.out.println(e);
		return e;
	}
	public int getX(WebElement ele)
	{
		int e = ele.getLocation().getX();
		System.out.println(e);
		return e;
	}
	public int getY(WebElement ele)
	{
		int e = ele.getLocation().getY();
		System.out.println(e);
		return e;
	}
	public Dimension getSize(WebElement ele,String val)
	{
		Dimension s = ele.getSize();
		System.out.println(s);
		return s;
	}
	public void getTagName(WebElement ele)
	{
		String text = ele.getTagName();
		System.out.println(text);
	}
	public void getText(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
	}
	public void isDisplayed(WebElement ele)
	{
		boolean b = ele.isDisplayed();
		System.out.println(b);
	}
	public void isEnabled(WebElement ele)
	{
		boolean b = ele.isEnabled();
		System.out.println(b);
	}
	public void isSelected(WebElement ele)
	{
		boolean b = ele.isSelected();
		System.out.println(b);
	}
	public void sendKeys(WebElement ele,String b)
	{
		ele.sendKeys(b);
		
	}
	public void submit(WebElement ele)
	{
		ele.submit();
		
	}



}

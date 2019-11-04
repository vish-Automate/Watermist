package generic_libraries;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{
	Select s;
	
	public dropdown(WebElement ele)          // constructor consists of object here 
	{
		s = new Select(ele);
	}
	
	public void selectIndex(int value)
	{
		s.selectByIndex(value);
	}
	
	
	public void selectValue(String value)
	{
		s.selectByValue(value);	
	}
	
	public void selectVisibleText(String Text)
	{	
		s.selectByVisibleText(Text);
	}
	
	public void DeselectAll(WebElement ele)
	{	
		s.deselectAll();
	}
	
	public void DeselectValue(String value)
	{
		s.deselectByValue(value);
	}
	
	
	public void deselectVisibleText(String Text)
	{	
		s.deselectByVisibleText(Text);
	}
	public void deselectIndex(int i)
	{
		s.deselectByIndex(i);
	}
	
	public ArrayList<String> selectIndex(WebElement ele)
	{
		ArrayList<String> l=new ArrayList<String>();
		
		 List<WebElement> g = s.getOptions();
		
		 for(WebElement e:g)
		 {
			 String text = e.getText();
			 l.add(text);
			 
		 
		 }
		return l ;
	}
	public void isMultiple(WebElement ele)
	{
		boolean b = s.isMultiple();
		System.out.println(b);
	}
	
	
	public ArrayList<String> getallSelected(WebElement ele)
	{
		ArrayList<String> l=new ArrayList<String>();
	
		 List<WebElement> g = s.getAllSelectedOptions();

		 for(WebElement e:g)
		 {
			 String text = e.getText();
			 l.add(text); 
		 }
		return l;
	}
	
   public void getFirstSelectedOption(WebElement ele)
    {
	   
   WebElement f = s.getFirstSelectedOption();
   String text = f.getText();
   System.out.println(text);
   
    }
   
}
	
	
	
	
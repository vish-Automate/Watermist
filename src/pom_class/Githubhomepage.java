package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Githubhomepage 
{
	
	@FindBy(xpath="//a[.='Start a project']")
	private WebElement startproject;
	
	
	public Githubhomepage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickstartpro()
	{
		startproject.click();
	}
	
}

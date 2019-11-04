package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Githubsinginpage 
{
	@FindBy(xpath="//input[@name='login']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@name='commit']")
	private WebElement signin;
	
	
	
	public Githubsinginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void gitlogin(String val,String passwrd)
	{
		emailid.sendKeys(val);
		pwd.sendKeys(passwrd);
		signin.click();
		
	}
	
	
//		public void clicksng()
//	{
//		signin.click();
//	}
//	
}

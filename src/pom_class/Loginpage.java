package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{ 
	@FindBy(id="email")
	public WebElement untbox;
	
	@FindBy(name="pass")
	public WebElement pwdtbox;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement login;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setusername(String un)
	{
		untbox.sendKeys(un);
	}
	
	public void setpassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	 public void clicklogin()
	 {
		 login.click();
	 }
	
	
	

}

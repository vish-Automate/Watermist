package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHUB 
{
	@FindBy(xpath="//a[@class='HeaderMenu-link no-underline mr-3']")
	private WebElement signclick;
	
	
	public GitHUB( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clicksign()
	{
	    signclick.click();	
	}
	
	

	

}

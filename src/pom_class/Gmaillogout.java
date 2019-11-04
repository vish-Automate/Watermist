package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmaillogout 
{
	@FindBy(xpath="//span[@class='gb_xa gbii']")
	private WebElement selectlogout;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement clicklogout;
	
	public Gmaillogout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logout1() throws InterruptedException
	{
		selectlogout.click();
		Thread.sleep(2000);
		clicklogout.click();
	}
	
	

}

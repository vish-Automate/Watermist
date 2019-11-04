package pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Login_gmail 
{
	@FindBy(id="identifierId")
	public WebElement usertbox;
	
	@FindBy(xpath="//span[.='Next']")
	public WebElement nextclick;

    
	public Login_gmail(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void enterun(WebDriver driver,String un)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Next']")));
		usertbox.sendKeys(un);
	}
	public void click()
	{
		nextclick.click();
	}
	
	
}

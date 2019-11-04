package pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_login2 
{
	@FindBy(name="password")
	private WebElement pwtxtbox;
	
	@FindBy(xpath="//span[.='Next']")
	public WebElement nextclick;
	
	public Gmail_login2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void enterpwd(WebDriver driver, String pw)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Next']")));
		pwtxtbox.sendKeys(pw);
	}
	
	public void clicknext()
	{
		nextclick.click();
	}
	


}

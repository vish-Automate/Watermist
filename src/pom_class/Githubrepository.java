package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Githubrepository 
{
	
	@FindBy(xpath="//input[@id='repository_name']")
	private WebElement Enterepname;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement clickcreatrep;
	
	public Githubrepository(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Repositoryname(String val)
	{
		Enterepname.sendKeys(val);
	}
	
	public void clickcreate()
	{
		clickcreatrep.click();
	}

}

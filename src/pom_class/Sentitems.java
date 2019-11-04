package pom_class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Sentitems
{
	@FindBy(xpath="//a[.='Sent']")
	private WebElement clicksent;
	
	@FindBy(xpath="(//span[.='akshay.venk.'])[1]")
	private WebElement selectmail;
	
	@FindBy(xpath="(//span[@role='gridcell'])[2]")
	private WebElement time;
	
	public Sentitems(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String gettext(WebDriver driver) throws InterruptedException
	{
		clicksent.click();
		Thread.sleep(6000);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[.='akshay.venk.'])[1]")));
		selectmail.click();
		String x = time.getText();
				
		return x;
		
	}

}

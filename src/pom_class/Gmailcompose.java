package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmailcompose 
{
  @FindBy(xpath="(//div[.='Compose'])[3]")
  public WebElement clickcom;
  
  @FindBy(xpath="//textarea[@name='to']")
  public WebElement enterTO;
  
  @FindBy(xpath="//div[@role='textbox']")
  public WebElement entermsg;
  
  @FindBy(xpath="//div[.='Send']")
  public WebElement clicksend;
  
  public Gmailcompose(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  
  }
  
  public void clickcompose()
  {
	  clickcom.click();
  }
  
  public void tofield(String to)
  {
	  enterTO.sendKeys(to);
  }
  
  public void messsage(String msg)
  {
	  entermsg.sendKeys(msg);
  }
  
  public void sendclick()
  {
	  clicksend.click();
  }
  
  
}

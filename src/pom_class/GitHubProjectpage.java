package pom_class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubProjectpage extends generic_libraries.WriteDataEXLsheet
{
	@FindBy(xpath="//input[@id='empty-setup-clone-url']")
	private WebElement Projtext;
	
    @FindBy(xpath="//pre[@id='empty-setup-new-repo-echo']")
	private WebElement BelowText;
    
    public GitHubProjectpage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void printtext() throws EncryptedDocumentException, InvalidFormatException, IOException
    {
    	String x = Projtext.getAttribute("value");
    	System.out.println(x);
    	generic_libraries.WriteDataEXLsheet wd = new generic_libraries.WriteDataEXLsheet();
    	wd.Writetext("Sheet1", 0, x);
   
    }
    
    public void printblowtext() throws EncryptedDocumentException, InvalidFormatException, IOException
    {
    	String y = BelowText.getText();
    	System.out.println(y);
    	generic_libraries.WriteDataEXLsheet wd = new generic_libraries.WriteDataEXLsheet();
    	wd.Writetext("Sheet1", 0, y);
    	
    }
	

}
;
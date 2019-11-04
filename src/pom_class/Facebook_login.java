package pom_class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libraries.dropdown;

public class Facebook_login 
{
   @FindBy(xpath="//input[@id='u_0_m']")
   private WebElement fname;
   
   @FindBy(xpath="(//input[@type='text'])[2]")
   private WebElement surname;
   
   @FindBy(xpath="(//input[@type='text'])[3]")
   private WebElement email;
   
   @FindBy(xpath="//input[@name='reg_email_confirmation__']")
   private WebElement reemail;
   
   @FindBy(xpath="(//input[@type='password'])[2]")
   private WebElement pwd;
   
   @FindBy(xpath="//select[@id='day']")
   private WebElement Day;
   
   @FindBy(xpath="//select[@id='month']")
   private WebElement month;
   
   @FindBy(xpath="//select[@id='year']")
   private WebElement year;
   
   @FindBy(xpath="(//input[@name='sex'])[2]")
   private WebElement genderM;
   
   @FindBy(xpath="//button[.='Sign Up']")
   private WebElement signup;
   
   
   public Facebook_login(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void firstname(String val)
   {
	   fname.sendKeys(val);
   }
   
   public void sname(String val)
   {
	   surname.sendKeys(val);
   }
   
   public void emailid(String val)
   {
	   email.sendKeys(val);
   }
   
   public void re_email(String val)
   {
	   reemail.sendKeys(val);
   }
   
   public void password(String val)
   {
	   pwd.sendKeys(val);
   }
   
   
   public void date()
   {
	   generic_libraries.dropdown dp = new generic_libraries.dropdown(Day);
	   dp.selectIndex(25);
   }
   
   public void month()
   {
	   generic_libraries.dropdown dp = new generic_libraries.dropdown(month);
	   dp.selectIndex(4);
   }
   
   public void year1()
   {
	   dropdown dp = new dropdown(year);
	   dp.selectIndex(24);
   }
   
   
   public void gender()
   {
	   genderM.click();
   }
   
   public void signupclick()
   {
	   signup.click();
   }
   
   
   
}

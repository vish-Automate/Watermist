package scripts_test;

import org.testng.Reporter;
import org.testng.annotations.Test;


import generic_libraries.Generic_class;
import pom_class.Gmail_login2;
import pom_class.Gmailcompose;
import pom_class.Login_gmail;
import pom_class.Sentitems;

public class Gmail_test extends Generic_class
{
  @Test
  public void logingmail1() throws InterruptedException
  {
	  Login_gmail l=new Login_gmail(driver);
	  l.enterun(driver, "vishwaskp67@gmail.com");
	  l.click();
	  
	  Thread.sleep(3000); 
	  
	  Gmail_login2 l1= new Gmail_login2(driver);
	  l1.enterpwd(driver, "vishwaskp7");
	  l1.clicknext();
	  
	  Thread.sleep(8000);
	  
	  Gmailcompose gc = new Gmailcompose(driver);
	  gc.clickcompose();
	  Thread.sleep(8000);
	  gc.tofield("akshay.venkatramu@gmail.com");
	  gc.messsage("hiiiiiiii");
	  Thread.sleep(2000);
	  gc.sendclick();
	  
	  Thread.sleep(8000);
	  Sentitems st= new Sentitems(driver);
	
	  String text = st.gettext(driver);
	  Reporter.log(text, true);
  }
  
     
    
     
  
}

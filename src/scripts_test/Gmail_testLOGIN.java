package scripts_test;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import generic_libraries.Generic111_class;

import generic_libraries.GetExcelDATA;
//import pom_class.Gmail_login2;
//import pom_class.Gmaillogout;
import pom_class.Login_gmail;

public class Gmail_testLOGIN extends Generic111_class
{
	@Test
	public void logingmail() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
      String un = GetExcelDATA.getdata("Sheet1", 1, 0);
		 
		
	  Login_gmail l=new Login_gmail(driver);
	  l.enterun(driver,un);
	  l.click();
	  
//	  Thread.sleep(3000);
//	  
//	  Gmail_login2 l1= new Gmail_login2(driver);
//	  l1.enterpwd(driver, "vishwaskp7");
//	  l1.clicknext();
//	  
//	  Thread.sleep(3000);
//	   
//	  Gmaillogout gm = new Gmaillogout(driver);
//      gm.logout1();
// 	  
    }
}
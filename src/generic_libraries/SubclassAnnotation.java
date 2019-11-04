package generic_libraries;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;




public class SubclassAnnotation extends Generic_class
{
	@Test
	public void login() throws InterruptedException, IOException
	{
//WebElement ele = driver.findElement(By.xpath("//input[@id='u_0_m']"));
		
driver.findElement(By.name("email")).sendKeys("vishwaskp67@gmail.com");
driver.findElement(By.id("pass")).sendKeys("vishwaskp7");
String title = driver.getTitle();
System.out.println(title);
//Assert.assertEquals(title,"");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='submit']")).click();

Assert.assertTrue(title.contains("book"));
	}
	

}

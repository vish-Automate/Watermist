package parallel_demo;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_pmg 
{
  @Parameters({"city","country"})
  @Test
  public void test_prallel(String city, String country)
  { 
	  Reporter.log(city, true);
	  Reporter.log(country, true);
	
	  
  }
}

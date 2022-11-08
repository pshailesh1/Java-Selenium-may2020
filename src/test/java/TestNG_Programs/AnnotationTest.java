package TestNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class AnnotationTest
{
	@Test
  public void f() 
	{
		System.out.println("First TestNG Class");
  }
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Before Test stsrts execute after beforeSuit method");
	}
		
	@AfterTest 
	public void afterTest()
	{
		System.out.println("");
	}
	
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before Suite starts executs beforeSuit Method");
	  
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After Suit execution done then execute afterSuit Method");
  }

}

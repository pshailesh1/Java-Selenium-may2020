package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Edge_Test {
	public WebDriver driver;
	
	@BeforeTest
	public void beforetest() 
  {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("http://www.facebook.com"); 
  }
	@Test(invocationCount = 5)
	public void  EdgeTest() 
	{
		
		System.out.println("Edge Thread Id"+Thread.currentThread().getId());
		driver.get("http://www.facebook.com"); 
	}
	@AfterTest
	public void aftertest() 
	{
		driver.close();
		
	}
}

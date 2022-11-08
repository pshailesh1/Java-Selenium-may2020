package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefox_Test {
	public WebDriver driver;

	@BeforeTest
	public void beforetest() 
  {
	  System.setProperty("webdriver.gecho.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\geckodriver.exe");
	  driver=new FirefoxDriver();
  }
	@SuppressWarnings("deprecation")
	@Test
	public void  FirefoxTest() 
	{
		
		System.out.println("Firefox Thread Id"+Thread.currentThread().getId());
		driver.get("http://www.facebook.com"); 
	}
	@AfterTest
	public void aftertest() 
	{
		driver.close();
		
	}
}

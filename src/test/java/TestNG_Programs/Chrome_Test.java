package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrome_Test {
	public WebDriver driver;
	@BeforeTest
	public void beforetest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.facebook.com"); 
  }
	@Test(invocationCount = 5, threadPoolSize = 5, timeOut = 5000)
	public void  ChromeTest() 
	{
		
		System.out.println("Chrome Thread Id"+Thread.currentThread().getId());
		driver.get("http://www.facebook.com"); 
	}
	@AfterTest
	public void aftertest() 
	{
		driver.close();
		
	}
}

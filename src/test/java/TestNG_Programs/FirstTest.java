package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest 
{
	@Test
	  public void launch_chrome() 
	  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
	
	
	
	@Test(priority = 1)
  public void launch_edge() 
  {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\msedgedriver.exe");
	  WebDriver driver=new EdgeDriver();
	  driver.get("http://www.facebook.com"); 
  }
  @Test
  public void launch_Firefox() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.facebook.com"); 
  }
  
  
}

package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.netty.util.ThreadDeathWatcher;
@Listeners(TestNG_Programs.Listeners_TestNG.class )
public class Parellel_Test 
{
	@Test
	  public void launch_chrome() 
	  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println(Thread.currentThread().getId());
	driver.get("https://www.facebook.com");
}
	@Test
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
	  System.out.println("Chrome Thread Id"+Thread.currentThread().getId());
	  driver.get("http://www.facebook.com"); 
}  
}

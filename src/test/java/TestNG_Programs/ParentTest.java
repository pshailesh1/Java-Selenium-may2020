package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParentTest 
{
	public WebDriver driver;
	  @Test
	  public void launchchrome() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.utkarshaaacademy.com");
			driver.manage().window().maximize();
	  }

}

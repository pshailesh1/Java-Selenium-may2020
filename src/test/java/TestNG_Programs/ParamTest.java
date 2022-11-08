package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParamTest {
	public WebDriver driver;
  @Test
  @Parameters("browser")
  public void selectBrowser(@Optional("chrome") String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("https://www.Utkarshaaacademy.com");
		  driver.manage().window().maximize();
		
	}
	  else if (browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver","C:\\Browser Drivers\\msedgedriver.exe");
		  driver= new EdgeDriver();
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		
	}
  }
}

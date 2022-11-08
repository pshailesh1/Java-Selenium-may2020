package TestNG_Programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert_Demo 
{
	public WebDriver driver;
	@Test
	public void f() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.utkarshaaacademy.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String ExpectedTitle = "Utkarshaa Academy";
		String ActualTitle  = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
}

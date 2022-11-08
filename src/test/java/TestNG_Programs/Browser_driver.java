package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Browser_driver{
public WebDriver driver;

	@Test  //Success Test
	public void CloseBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test //Failed Test
	public void OpenBrowser() {
			driver = new FirefoxDriver(); 
	        driver.get("https://www.utkarshaaacademy.com");
	        String expectedTitle = "Utkarshaa academy";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not matchs");
  }
	private int i = 1;

	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	
	@Test  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
}
package TestNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Methods_Demo 
{
	public WebDriver driver;
	
  @Test
  public void VerifyTitle() 
  {
	  String ExpectedTitle ="Utkarsha Academy";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
  @Test(priority = 1)
  public void ClickonJobs() 
  {
	  WebElement QAEngineer = driver.findElement(By.xpath("//a[text()='QA Engineer']"));
	  QAEngineer.click();
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.Utkarshaaacademy.com");

  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}

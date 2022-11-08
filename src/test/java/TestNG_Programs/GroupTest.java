package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest {
	public WebDriver driver;

  @Test(priority = 1,groups = {"sanity","regression"})
  public void LounchBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.Utkarshaaacademy.com");
	  driver.manage().window().maximize();
  }
  @Test(priority = 2,groups = "regression")
  public void VerifyTitle() 
  {
	  String ExpectedTitle ="Utkarshaa Academy";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  Reporter.log("Verify Title Test get Pass when Title Matches",false);
	  Reporter.log(ActualTitle);
	  Reporter.log(driver.getCurrentUrl());
  }
  @Test(priority = 3,groups = "regression")
  public void ClickonJobs() 
  {
	  WebElement QAEngineer = driver.findElement(By.xpath("//a[text()='QA Engineer']"));
	  QAEngineer.click();
	  System.out.println(driver.getCurrentUrl());
  }
}

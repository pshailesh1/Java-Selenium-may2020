package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencytest {
	public WebDriver driver;
  @Test
  public void launchchrome() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		driver.manage().window().maximize();
  }
  @Test
  public void VerifyTitle() 
  {
	  String ExpectedTitle ="Utkarsha Academy";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
  
  @Test(dependsOnMethods = "launchchrome")
  public void ClickonJobs() 
  {
	  WebElement QAEngineer = driver.findElement(By.xpath("//a[text()='QA Engineer']"));
	  QAEngineer.click();
  }
}

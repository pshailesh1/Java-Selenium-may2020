package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildTest extends ParentTest
{
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

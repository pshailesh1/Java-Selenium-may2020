package TestNG_Programs;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProvider_Demo {
	public WebDriver driver;
  @Test(dataProvider = "dp",dataProviderClass = Dp_Demo.class )
  public void f(String userid, String password) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement UserName =driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement Password =driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
	  UserName.sendKeys(userid);
	  Password.sendKeys(password);
	  LoginBtn.click();  
  }
  @DataProvider(parallel = true)
  public Object[][] dp() {
    return new Object[][] {
    	      new Object[] {"shaileshpokharkar", "8149320390" },
    	      new Object[] {"8149320390", "7620941253" }, 
    	      new Object[] {"7894561323", "1234567899" },
    };
}
  }


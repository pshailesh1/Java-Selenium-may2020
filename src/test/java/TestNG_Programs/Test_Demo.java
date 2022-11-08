package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Demo {
	@Test
	public void firsttest() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\selenium2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
	}
	@Test
	public void secondtest() 
	{	
		String ExpectedTitle = "Utkarshaa Academy";
	}
	@Test
	public void thirdtest() {
		
	}
	@Test
	public void forthtest() {
		
	}
}

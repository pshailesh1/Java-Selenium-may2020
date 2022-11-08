package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticLoginpage 
{
	WebDriver driver;
	By UserEmail = By.xpath("//input[@name='username']");
	By UserPassword = By.xpath("//input[@name='password']");
	By LoginBtn = By.xpath("//button[text()='Submit']");

 public PracticLoginpage(WebDriver driver) 
 {
	 this.driver=driver;
 }
 public void setUserName(String strUserName) 
 {
	 driver.findElement(UserEmail).sendKeys(strUserName);
 }
 public void setUserPassword(String strUserPassword) 
 {
	 driver.findElement(UserPassword).sendKeys(strUserPassword);
 }
 public void clickLogin() 
 {
	 driver.findElement(LoginBtn).click();
 }
 
 public void loginToPractice(String strUserName, String strUserPassword) 
 {
	this.setUserName(strUserName);
	
	this.setUserPassword(strUserPassword);
	
	this.clickLogin();
 }
}

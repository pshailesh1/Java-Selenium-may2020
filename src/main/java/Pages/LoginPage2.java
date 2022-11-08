package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;
	
	//By UserEmail = By.xpath("//input[@name='email']");
	//By UserPassword = By.xpath("//input[@name='password']");
	//By ChooseAdmin = By.cssSelector("div>select[name='category'] :nth-of-type(2)");
	//By LoginBtn = By.xpath("//button[text()='Login']");
	
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement UserEmail;
	@FindBy(xpath = "//input[@name='password']")
	WebElement UserPassword;
	@FindBy(css = "div>select[name='category'] :nth-of-type(2)")
	WebElement ChooseAdmin;
	@FindBy(xpath = "//Button[text()='Login']")
	WebElement LoginBtn;

 public LoginPage2(WebDriver driver) 
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
	 
 public void setUserName(String strUserName) 
 {
	UserEmail.sendKeys(strUserName);
 }
 public void setUserPassword(String strUserPassword) 
 {
	UserPassword.sendKeys(strUserPassword);
 }
 
 public void selectChooseAccount() 
 {
	 ChooseAdmin.click();
 }
 public void clickLogin() 
 {
	 LoginBtn.click();
 }
 
 public void loginToHMS(String strUserName, String strUserPassword) 
 {
	this.setUserName(strUserName);
	
	this.setUserPassword(strUserPassword);
	
	this.selectChooseAccount();
	
	this.clickLogin();
 }

}

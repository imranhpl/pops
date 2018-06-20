package automatedScripts;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import utility.Constant;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginModule {
	public WebDriver driver;
	
  @Test
  public void sn_1() {
	
	  String hpl=HomePage.hpl(driver).getText();
	  Assert.assertEquals(hpl, "HPL");
	  HomePage.logoutDropDown(driver).click();
	  HomePage.logoutButton(driver).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", Constant.SetProperty);
	  driver = new ChromeDriver();
	  
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		  driver.get(Constant.URL);
		  LoginPage.signInButton(driver).click();
		  LoginPage.email(driver).sendKeys(Constant.Username);
		  LoginPage.password(driver).sendKeys(Constant.Password);
		  LoginPage.loginButton(driver).click();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  }

}

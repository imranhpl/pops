package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private static WebElement element = null;
	 
	 public static WebElement signUp(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//a[@href='https://www.popssoftware.com/sign-up'][text()='Sign Up']"));
	 
	    return element;//commit and push
	 
	    }
	 
	 public static WebElement signInButton(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//a[@href='https://www.popssoftware.com/signin'][text()='Sign In']"));
		 
		    return element;
		 
		    }
	 public static WebElement email(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@class='form-control'][@name='email']"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement password(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@class='form-control'][@name='password']"));
		 
		    return element;
		 
		    }
	 public static WebElement loginButton(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//button[@type='submit']"));
		 
		    return element;
		 
		    }
}

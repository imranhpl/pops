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
	 
	 public static WebElement signIn(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//a[@href='https://www.popssoftware.com/signin'][text()='Sign In']"));
		 
		    return element;
		 
		    }
}

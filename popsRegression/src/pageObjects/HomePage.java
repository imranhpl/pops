package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
	 
	 public static WebElement hpl(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//strong[text()='HPL']"));
	 
	    return element;//commit and push
	 
	    }
	
	 public static WebElement logoutDropDown(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//span[@id='profile_dropdown_caret']"));
		 
		    return element;//commit and push
		 
		    }
	 public static WebElement logoutButton(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//a[@id='logout']"));
		 
		    return element;//commit and push
		 
		    }
	 
	 public static WebElement contact(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//span[text()='Contacts']"));
		 
		    return element;//commit and push
		 
		    }
	 public static WebElement addContact(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//a[@href='https://www.popssoftware.com/contacts/create'][@target='_blank']"));
		 
		    return element;//commit and push
		 
		    }
	 
}

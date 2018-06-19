package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactInfoPage {
	private static WebElement element = null;
	 
	 public static WebElement categoryType(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//select[@name='contact_type_id']"));
	 
	    return element;//commit and push
	 
	    }
	 public static WebElement firstName(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@name='first_name']"));
		 
		    return element;//commit and push
		 
		    }
	 
	 public static WebElement middleName(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@name='middle_initial']"));
		 
		    return element;//commit and push
		 
		    }
	 
	 public static WebElement lastName(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@name='last_name']"));
		 
		    return element;//commit and push
		 
		    }
	 public static WebElement email(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@name='email']"));
		 
		    return element;//commit and push
		 
		    }
	 
	 public static WebElement numberType(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//select[@name='number_type[]']"));
		 
		    return element;//commit and push
		 
		    }
	 
	 public static WebElement extension(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@type='text'][@name='ext[]']"));
		 
		    return element;//commit and push
		 
		    }
	 public static WebElement streetAddress(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@name='address']"));
		 
		    return element;//commit and push
		 
		    }
	 
	 public static WebElement aptSuitNo(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//input[@name='apt_suite_no']"));
		 
		    return element;//commit and push
		 
		    }
	 
	 public static WebElement saveAndNext(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//span//i[@class='fa fa-arrow-right fa-btn fa-back']"));
		 
		    return element;//commit and push
		 
		    }
	 
	 
}

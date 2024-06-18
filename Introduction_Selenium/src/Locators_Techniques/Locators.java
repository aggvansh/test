package Locators_Techniques;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


 public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		String name= "Vansh";

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password= getPassword(driver);//Calling password method with in the same class.
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		driver.findElement(By.className("signInBtn")).click();
		
	    driver.findElement(By.cssSelector("p.error")).getText();
	    
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	    
	    driver.findElement(By.cssSelector("input[placeholder='Email'")).sendKeys("john@abc.com");
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();	
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("787986986");
	    driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    
	  
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();	    
	    	    
	    driver.close();
	    
	      
	
	}

 

 public static String getPassword(WebDriver driver) throws InterruptedException
{
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();  
    Thread.sleep(1000);
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	
    String passwordText =(driver.findElement(By.cssSelector("form p")).getText());
    //Please use temporary password 'rahulshettyacademy' to Login.
     String[] passwordArray = passwordText.split("'");
     String password= passwordArray[1].split("'")[0];
     return password;
     
    // 1st split
    //0th index - Please use temporary password.
    //1st index - rahulshettyacademy' to Login.
    
     // 2nd split
     //0th index - rahulshettyacademy
     //1st index - to Login.
     
}
 
 }
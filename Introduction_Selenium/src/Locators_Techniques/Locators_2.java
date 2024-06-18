package Locators_Techniques;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators_2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name="Vansh";
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password= getPassword(driver);//Calling password method with in the same class.
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals((driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()), "Hello " +name+",");
        //(By.cssSelector("div[class='login-container'] h2")) //customize CSS from parent tag name to child tag name
        driver.findElement(By.xpath("//button[text()='Log Out']")).click(); // to locate button with the help of its text with the help of x path 
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

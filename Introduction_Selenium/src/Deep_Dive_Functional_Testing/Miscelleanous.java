package Deep_Dive_Functional_Testing;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Miscelleanous {

	public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	 driver.get("http://facebook.com");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("fsfd"); //input[@id='email']
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("http://google.com");
	 
	 
		
	     
	     


	     
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

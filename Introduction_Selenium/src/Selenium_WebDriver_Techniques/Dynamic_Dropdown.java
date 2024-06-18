package Selenium_WebDriver_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();	//a[@value='BLR']
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();	//a[@value='MLA'] 
		
		// In case Index is not allowed to use in code. 
		//glsctl00_mainContent_ddl_destinationStation1_CTNR
		// use parent to child traverse
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();   //to select current date of calender
		//ui-state-default ui-state-highlight ui-state-active
	    driver.close();
		
		
		
		
	}

}

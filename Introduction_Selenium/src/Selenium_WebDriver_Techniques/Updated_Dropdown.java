package Selenium_WebDriver_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Updated_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	//	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		{
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	//	Count the number of checkboxes--->Find locator value that is common in all check boxes then use it css locator to find no of check boxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // input[type='check box"]
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		//int i=1;
	/*	while(i<=4)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //4times
			i++;
		}
	*/
	
	//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // showing 1 Adult
		
		for(int i=1;i<=4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //4times
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // showing 5 Adult
		
		driver.close();
	}

}

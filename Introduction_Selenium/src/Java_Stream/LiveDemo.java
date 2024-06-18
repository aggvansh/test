package Java_Stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		/*
		 * click on column Capture all the webElement in the list Capture text of all
		 * webElement into new(Original) list apply sort on the original list of step3
		 * compare original list vs sorted list.
		 * 
		 */

		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> Elementlist = driver.findElements(By.xpath("tr/td[1]"));
		List<String> originalList = Elementlist.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		// Scan the name column with get text-->Rice->Print the price of the rice
		
		do
		{
			List<WebElement>rows= driver.findElements(By.xpath("//tr/td[1]"));
		    price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s))
				.collect(Collectors.toList());
		  
		   price.forEach(i->System.out.println(i));
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
		
	//	driver.close();

	}

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}

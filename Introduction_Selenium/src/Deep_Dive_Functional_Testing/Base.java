package Deep_Dive_Functional_Testing;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		int j= 0;

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Tomato" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1kg
			// Brocolli , 1kg

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// Format it to get actual vegetable name
			// Convert array into array list for easy search
			// Check whether name you are extracted is present in arraylist or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				// Click on Add to Cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}

			}

		}

		// driver.close();
	}

}

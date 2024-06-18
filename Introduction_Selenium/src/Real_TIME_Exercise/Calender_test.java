package Real_TIME_Exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender_test {

	public static void main(String[] args) throws InterruptedException {
		String monthNumber = "6";
		String date = "15";
		String year = "2027";
		String[] expectedlist = { monthNumber, date, year };

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();// react-date-picker__inputGroup
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();// react-calendar__navigation__label__labelText
																									// react-calendar__navigation__label__labelText--from
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile.react-calendar__year-view__months__month"))
				.get(Integer.parseInt(monthNumber) - 1).click();

		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		Thread.sleep(5000);
		List<WebElement> actuallist = driver.findElements(By.cssSelector(
				".react-date-picker__inputGroup__input react-date-picker__inputGroup__month.react-date-picker__inputGroup__input--hasLeadingZero"));

		// react-date-picker__inputGroup__input react-date-picker__inputGroup__month
		// react-date-picker__inputGroup__input--hasLeadingZero

		for (int i = 0; i < actuallist.size(); i++) {
			System.out.println(actuallist.get(i).getAttribute("value"));
			Assert.assertEquals(actuallist.get(i).getAttribute("value"), expectedlist[i]);
		}

		driver.close();

	}

}

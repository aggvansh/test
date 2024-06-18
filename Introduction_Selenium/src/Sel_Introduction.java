import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Sel_Introduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome -Chrome Driver
		//Firefox- Firefox Driver
		
		
		 System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\vansh\\Documents\\chromedriver.exe\"");
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com");
		 driver.getTitle();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.quit();
		 
		 
		
	//	System.setProperty("webdriver.gecko.driver", "C:\Users\vansh\Downloads\geckodriver-v0.34.0-win64\geckodriver.exe");
			
	/*	 WebDriver driver = new FirefoxDriver();
		 driver.get("https://rahulshettyacademy.com");
		 driver.getTitle();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.quit();
	*/
		
	/*	 WebDriver driver = new EdgeDriver();
		 driver.get("https://rahulshettyacademy.com");
		 driver.getTitle();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.quit();
	*/	 
	}

}

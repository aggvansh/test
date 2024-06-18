package Section_12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Miscelleanous {

	public static void main(String[] args) throws IOException  { 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	//	driver.manage().deleteCookieNamed("sessionKey");

      // Click on any link
		//login page- verify login URL
		
		driver.get("https://google.com");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\New folder\\screenshot.png"));
		
		
	}

}

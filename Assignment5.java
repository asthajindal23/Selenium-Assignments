//Write a WebDriver script to capture a screenshot of a webpage and save it to a specific location
package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Assignment5 {
  @Test
  public void captureScreenshot() throws IOException, InterruptedException {
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.koskii.com/");
		Thread.sleep(2000);
		TakesScreenshot ss=(TakesScreenshot) driver;
		File capture= ss.getScreenshotAs(OutputType.FILE);
		
		File path= new File("./"+ "\\Screenshots\\koskii.png");
		FileHandler.copy(capture,path);
		}
}

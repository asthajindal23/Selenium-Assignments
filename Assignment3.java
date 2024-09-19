//Write a WebDriver script to handle a dropdown and select an option based on specific criteria.
package assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement ele= driver.findElement(By.xpath("//select"));
		Select dd = new Select (ele);
		System.out.println("Is Multi selection: "+ dd.isMultiple());
		dd.selectByIndex(3);
		Thread.sleep(1500);
		dd.selectByValue("AFG");
		Thread.sleep(1500);
		dd.selectByVisibleText("Andorra");
		List<WebElement> options= dd.getOptions();
		System.out.println("Number of visible options: "+ options.size());
		}
}

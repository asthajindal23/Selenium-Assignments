//Write a WebDriver script to navigate to a website and click on a specific link.
package assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment1 {
	public static void main(String[] args) {
	//Opening Chrome
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	System.out.println("Title of Meesho Website is :"+driver.getTitle());
	//Open Meesho
	driver.navigate().to("https://www.koskii.com");
	System.out.println("Title of Koskii Website is :"+driver.getTitle());
	//Clicking on track your order
	driver.findElement(By.xpath("(//a[@href='https://track.koskii.com'])[2]")).click();
	}}

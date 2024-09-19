//Implement a test case using WebDriver to validate the functionality of a registration form.
package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		//Create new account
		driver.findElement(By.linkText("Create new account")).click();
		//Fill Form
		WebElement firstName= driver.findElement(By.name("firstname"));
		System.out.println("First Name Enabled: "+ firstName.isEnabled());
		firstName.sendKeys("Ashu");
		
		WebElement surName= driver.findElement(By.name("lastname"));
		System.out.println("SurName Enabled: "+ surName.isEnabled());
		surName.sendKeys("Sharma");
		
		WebElement mail=driver.findElement(By.name("reg_email__"));
		System.out.println("Email Enabled: "+ mail.isEnabled());
		mail.sendKeys("test@gmail.com");
		
		WebElement password=driver.findElement(By.id("password_step_input"));
		System.out.println("Password Enabled: "+ password.isEnabled());
		password.sendKeys("testuser12!");
		//Date Of Birth
		WebElement day= driver.findElement(By.id("day"));
		System.out.println("Day Enabled: "+ day.isEnabled());
		Select dd = new Select (day);
		dd.selectByVisibleText("14");
		
		WebElement month= driver.findElement(By.id("month"));
		System.out.println("Month Enabled: "+ month.isEnabled());
		Select dd_month = new Select (month);
		dd_month.selectByVisibleText("Apr");
		
		WebElement year= driver.findElement(By.id("year"));
		System.out.println("Year Enabled: "+ year.isEnabled());
		Select dd_year = new Select (year);
		dd_year.selectByVisibleText("1997");
		
		WebElement sex=driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		System.out.println("Sex Enabled: "+ sex.isEnabled());
		sex.click();
		
		WebElement signUp= driver.findElement(By.xpath("//button[@name='websubmit']"));
		System.out.println("Sign Up Enabled: "+ signUp.isEnabled());
		}

}

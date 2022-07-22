package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("naveen");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("naveennavisurya97@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("naveennavisurya97@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("naveen@12584");
		WebElement day= driver.findElement(By.id("day"));
		Select drop1=new Select(day);
		drop1.selectByIndex(4);
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select drop2=new Select(month);
		drop2.selectByIndex(6);
		WebElement year= driver.findElement(By.id("year"));
		Select drop3=new Select(year);
		drop3.selectByValue("1997");
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		driver.findElement(By.name("websubmit")).click();
	
		
	}
		
		
}

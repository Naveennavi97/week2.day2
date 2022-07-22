package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("naveennavichitra97@gmail.com");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("hello",Keys.TAB);
	driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
	driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
   
}
}

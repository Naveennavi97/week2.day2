package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ind= driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select drop1=new Select(ind);
		drop1.selectByIndex(3);
		
		WebElement tex= driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select drop2=new Select(tex);
		drop2.selectByVisibleText("Selenium");
		
		WebElement val= driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select drop3=new Select(val);
		drop3.selectByValue("3");
		
		
	}
	
}

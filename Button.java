package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Button {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='home']")).click();
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());
        System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color")
        );
       System.out.println( driver.findElement(By.xpath("//button[@id='size']"))
);
	}
}

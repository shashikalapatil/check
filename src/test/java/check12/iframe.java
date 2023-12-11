package check12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//body[@id='tinymce']//p")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']//p")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//body[@id='tinymce']//p")).sendKeys(Keys.CONTROL+"A");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@title='Bold']")).click();
		
		
		}

}

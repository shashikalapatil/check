package check12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tabledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int sum=0;
		for(int i=2;i<=7;i++)
		{
			String p=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]")).getText();
			System.out.println(p);
			sum=sum+Integer.parseInt(p);
		}
		System.out.println("total price is"+ sum);
	
	}
}

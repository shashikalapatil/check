package check12;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
        Set<String> ans=driver.getWindowHandles();
        for(String a:ans)
        {
        	String title1=driver.switchTo().window(a).getTitle();
        	if(title1.equals("Selenium - Wikipedia"))
        	{
        		driver.findElement(By.xpath("//*[@id='toc-Characteristics']")).click();
        		driver.close();
        		
        	}  
        	driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
        	for(String b:ans)
            {
            	String title2=driver.switchTo().window(b).getTitle();
            	if(title2.equals("Selenium in biology - Wikipedia"))
            	{
            		driver.findElement(By.xpath("//*[@id=\'pt-login-2\']/a/span")).click();
            		Thread.sleep(5000);
            		driver.close();
            	}
            }
        }
	}

}

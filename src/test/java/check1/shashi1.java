package check1;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shashi1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();


driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
Thread.sleep(5000);
//WebElement em=driver.findElement(By.name("email"));
//em.sendKeys(args)
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
/*String actual=driver.getTitle();
String Expected="OrangeHRM";

if(actual.equals(Expected))
{
	System.out.println("Test passed");
}
else
{
	System.out.println("failed");
}
driver.close();*/

String actua1=null;
try
{
actua1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
}
catch(NoSuchElementException e)
{
actua1="";
{
	
String expect1="Dashboard";
if(actua1.equals(expect1))
{
	System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	
	}
driver.close();
}
	}
}
}
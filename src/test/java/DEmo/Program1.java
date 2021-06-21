package DEmo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program1
{
WebDriver driver = null;
	
	@BeforeMethod
	public void Base()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test (priority =1)
	public void login()
	{
		driver.get("https://www.flipkart.com/account/login");
		WebElement username = driver.findElement(By.xpath("//input[@class = '_2IX_2- VJZDxU']"));
		username.sendKeys("archanaashok.s5@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("moncyachu@143");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	}
	
	@Test (priority =2)
	public void homepage()
	{
		driver.get("https://www.flipkart.com/account/login");
		WebElement search = driver.findElement(By.xpath("//input[@name = 'q' ]"));
		search.sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class = 'L0Z3Pu']")).click();
		
	}
	
	
	 @AfterMethod
	 public void exit() 
	 { 
		 driver.quit(); 
		 }
	 

}

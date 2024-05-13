package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	ChromeDriver driver;
	String Baseurl="https://www.facebook.com/";
	@BeforeTest
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test
	public void account() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String link=driver.getCurrentUrl();
		System.out.println(link);
		String expected="https://www.facebook.com/";
		if(link.equals(expected))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
}
}
package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb2 {
	ChromeDriver driver;
	String Baseurl="https://www.facebook.com";
	@Before
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test 
	public void setValues()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}

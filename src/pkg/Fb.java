package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	ChromeDriver driver;
	String Baseurl="https://www.google.com";
	@Before
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test 
	public void setValues()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		driver.findElement(By.name("login")).click();
	}
	
}

package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	String Baseurl="https://google.com";
	@Before
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test 
	public void setValues()
	{
		
		driver.findElement(By.name("q")).sendKeys("laptops",Keys.ENTER);
	}
}

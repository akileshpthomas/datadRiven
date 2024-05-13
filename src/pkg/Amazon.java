package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void setvalues() 
	{
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobile Phones",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]")).click();
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']/span[2]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		
		}
}

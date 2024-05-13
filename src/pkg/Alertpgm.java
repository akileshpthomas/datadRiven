package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/AKILESH%20P%20THOMAS/OneDrive/Desktop/wp.html";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test1() 
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='last name']")).sendKeys("de");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	}


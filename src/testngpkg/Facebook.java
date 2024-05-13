package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	ChromeDriver driver;
	String Baseurl="https://www.facebook.com";
	@BeforeTest
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Parameters({"email","password"})
	@Test 
	public void setValues(String email,String password)
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}

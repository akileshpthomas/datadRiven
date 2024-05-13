package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	String Baseurl="https://demo.guru99.com/test/upload/";
	@BeforeTest
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test
	public void account() {
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\AKILESH P THOMAS\\Downloads");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	
	String buttontext=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
	if(buttontext.equals("Submit File"))
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("failed");
	}
}
}
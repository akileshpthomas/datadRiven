package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiff {
	ChromeDriver driver;
	String Baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test 
	public void setValues()
	{
		
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("abc");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
}
}

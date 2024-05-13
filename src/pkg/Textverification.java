package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {
	ChromeDriver driver;
	String Baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test
	public void buttontextverification()
	{
		String buttontext=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		if(buttontext.equals("Check availability"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("failed");
		}
		
}
@Test
public void logo() 
{
	boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(logo)
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is not displayed");
	}
}
}
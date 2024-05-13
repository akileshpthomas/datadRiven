package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void setUp()
{
driver=new ChromeDriver();
driver.get(baseurl);
}
@Test
public void titleverification()
{
	String exp="Google";
	String actualtitle=driver.getTitle();
	if(actualtitle.equals(exp))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Failed");
	}
}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
}

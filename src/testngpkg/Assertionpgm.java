package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpgm {
ChromeDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void test()
{
	String actualtitle=driver.getTitle();
	String exp="Google";
	Assert.assertEquals(actualtitle, exp);
}
}

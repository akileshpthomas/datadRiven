package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Disablingnotification {
WebDriver driver;
@BeforeTest
public void beforetest()
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);
}
@Test
public void test()
{
	driver.get("https://www.justdial.com");
}
}

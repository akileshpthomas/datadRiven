package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;



public class Fbcreatetest {
	public class Fblogintest {
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		
		@Test
		public void title()
		{
			Fbcreatepage ob=new Fbcreatepage(driver);
			ob.btnclick();
			String actualtitle=ob.titleveri();
			Assert.assertEquals(actualtitle, "Facebook");
			
		}
}}

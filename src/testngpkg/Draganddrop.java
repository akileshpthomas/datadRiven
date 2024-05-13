package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	public class Ebay {
		ChromeDriver driver;
		String Baseurl="https://demo.guru99.com/test/drag_drop.html";
		@BeforeTest
	public void setUp()
	{
			driver=new ChromeDriver();
			driver.get(Baseurl);
	}
		@Test
		public void test2()
		{
			Actions act=new Actions(driver);
			WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
			WebElement To=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
			act.dragAndDrop(From, To).build().perform();
			WebElement Fromamount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement Toamount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
			act.dragAndDrop(Fromamount, Toamount).build().perform();
			WebElement debitFrom=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
			WebElement debitTo=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
			act.dragAndDrop(debitFrom, debitTo).build().perform();
			WebElement debitFromamount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement debitToamont=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
			act.dragAndDrop(debitFromamount, debitToamont).build().perform();
			if(driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed())
			{
				System.out.println("perfect displayed");
			}
			else
			{
				System.out.println("perfect not displayed");
				
			}
		}
}
}
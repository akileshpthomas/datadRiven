package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clicking {
	ChromeDriver driver;
	String Baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test
	public void test()
	{
		WebElement rc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rc).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		driver.switchTo().alert().accept();
		WebElement dc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dc).perform();
		Alert a=driver.switchTo().alert();
		System.out.println("alert text="+a.getText());
		a.accept();
		
		
		
		
		
	}
}

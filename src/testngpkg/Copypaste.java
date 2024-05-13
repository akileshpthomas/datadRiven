package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
	ChromeDriver driver;
	String Baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test
	public void test()
	{
		WebElement fn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rdfid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		fn.sendKeys("abc");
		Actions act=new Actions(driver);
		act.keyDown(fn,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fn,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rdfid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
}
}
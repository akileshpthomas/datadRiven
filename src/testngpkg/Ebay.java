package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	ChromeDriver driver;
	String Baseurl="https://www.ebay.com/";
	@BeforeTest
public void setUp()
{
		driver=new ChromeDriver();
		driver.get(Baseurl);
}
	@Test
	public void test()
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement p=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(p).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[3]/a"))).click();

	}

}

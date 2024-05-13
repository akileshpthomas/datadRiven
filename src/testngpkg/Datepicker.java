package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://trivago.com");
}
@Test
public void datepicker() throws Exception
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]")).click();
	datepickermethod("May 2024", "23");
}
private void datepickermethod(String expmonth, String expdate) throws Exception 
{
	Thread.sleep(5000);
	while(true)
	{
		String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
		System.out.println(month);
		if(month.equals(expmonth))
		{
			System.out.println("month="+month);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
		}
	}
	List<WebElement> alldates= driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	for(WebElement dateelement:alldates)
	{
		String date=dateelement.getText();
		if(date.equals(expdate))
		{
			System.out.println(date);
			dateelement.click();
			break;
		}
				
	}
	
	
}
}

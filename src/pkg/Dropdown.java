package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
ChromeDriver driver;
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get(baseurl);
}
@Test
public void dropdown()
{
	WebElement daydetails =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select day=new Select(daydetails);
	day.selectByValue("14");
	
	WebElement monthdetails =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select month=new Select(monthdetails);
	month.selectByVisibleText("AUG");
	
	
	WebElement yeardetails =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select year=new Select(yeardetails);
	year.selectByValue("1999");
	
}
}

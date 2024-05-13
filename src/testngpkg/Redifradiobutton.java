package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifradiobutton {
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
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		if(radiobutton.isSelected())
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button is not selected");
		}
		
	}
	

}

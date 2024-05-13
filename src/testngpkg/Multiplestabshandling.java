package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplestabshandling {
ChromeDriver driver;
String baseurl="https://demo.guru99.com/popup.php";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test()
{
	String MainWindow=driver.getWindowHandle();
	System.out.println("main window title"+driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	Set<String> allWindowHandles=driver.getWindowHandles();		
    for(String handle:allWindowHandles)
    {		
        if(!handle.equalsIgnoreCase(MainWindow))			
        {    		  
                driver.switchTo().window(handle);	                                                                                                           
                driver.findElement(By.name("emailid")).sendKeys("abcd@gmail.com");                			 
                driver.findElement(By.name("btnLogin")).click();			
                driver.close();		
        }	
        driver.switchTo().window(MainWindow);
    }		
}
}

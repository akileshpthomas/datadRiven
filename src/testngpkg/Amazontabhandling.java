package testngpkg;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontabhandling {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void setvalues() throws Exception 
	{
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String MainWindow=driver.getWindowHandle();
		System.out.println("main window title"+driver.getTitle());
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobile Phones",Keys.ENTER);
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/a/span/span[2]")).click();       
		 Set<String> allWindowHandles=driver.getWindowHandles();		
		    for(String handle:allWindowHandles)
		    {		
		        if(!handle.equalsIgnoreCase(MainWindow))			
		        {    		  
		                driver.switchTo().window(handle);	                                                                                                           
		                driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();           			 
		                driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		               
		                driver.close();		
		        }	
		        driver.switchTo().window(MainWindow);
		    }		
	}
	
	}

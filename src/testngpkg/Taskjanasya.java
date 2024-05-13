package testngpkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taskjanasya {
	FirefoxDriver driver;
	String Baseurl="https://janasya.com/";
	@BeforeTest
public void setUp()
{
		driver=new FirefoxDriver();
		driver.get(Baseurl);
		driver.manage().window().maximize();
}
	@Test(priority = 1)
	public void logoverification()
	{
		
		boolean logo=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16316676800682__9c03747e-b054-4db8-8194-5a35c71f82ca\"]/div/div/div/div[1]/div/a/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	
	@Test(priority = 2)
	public void newarrivals()
	{
		
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")).click();
	}
	@Test(priority = 3)
	public void categories()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement categories =driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3"));
		categories.click();
		WebElement kurtas=driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span"));
		kurtas.click();
	}
	@Test(priority = 4)
	public void wishlistcart()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement product=driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[1]/div[2]/div/div[2]/ul/li[1]/div/div/div[1]/div/div[2]/a"));
	Actions act = new Actions(driver);
	act.moveToElement(product).click().perform();
	product.click();
	driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[8]/div/product-form/form/div/div/div/div[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[8]/div/product-form/form/div/div/div/div[1]/div")).click();
	driver.findElement(By.xpath("/html/body/div[18]/div[2]/cart-coupon-discount/div/div[3]/div/div/a")).click();
	driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/cart-coupon-discount/cart-items/div/div/div/div[2]/form/div/div/a")).click();
	}
	@Test(priority = 5)
	public void ethnic()
	{
	WebElement e=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/nav/ul/li[3]/a/span[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(e).perform();
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/nav/ul/li[3]/ul/li[2]/a/span")).click();
	}
	@Test(priority = 6)
	public void dropdown()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement items=driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[1]/div[2]/div/toolbar-item/div[2]/div[3]/div[1]/div/div"));
		items.click();
		driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[1]/div[2]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li[2]/span")).click();
	}
	@Test(priority = 7)
	public void menu() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement main = driver.findElement(By.className("header__inline-menu"));
		List<WebElement>allmenu=main.findElements(By.tagName("li"));
		for(WebElement allmenutext:allmenu)
		{
			String text = allmenutext.getText().trim();
			if (!text.isEmpty())
			{
				System.out.println("The menus are = "+text);
			}
		}
	}
	@Test(priority = 8)
	public void links() 
	{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("total number of links="+li.size());
	for(WebElement ele:li) {
	String link=ele.getAttribute("href");
	String linktext=ele.getText();
	System.out.println(link+"-----------------------"+linktext);
	}
	}
	@Test (priority=9)
	public void screenshot() throws IOException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./Screenshotlatest/src.png"));
		
	}
	}
	
	
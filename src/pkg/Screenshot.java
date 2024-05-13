package pkg;
import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
ChromeDriver driver;
String baseurl="https://www.facebook.com";
@Before
public void SetUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test() throws IOException
{
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File("E://Facebook.png"));
WebElement button=driver.findElement(By.name("login"));
File buttonscreenshot=button.getScreenshotAs(OutputType.FILE);
FileHandler.copy(buttonscreenshot, new File("./Screenshot/buttonscreenshot.png"));

}
}

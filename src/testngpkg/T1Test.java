package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class T1Test {                
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeTest
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterTest
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void t1() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.id("APjFqb")).sendKeys("cars");
    {
      WebElement element = driver.findElement(By.cssSelector(".hlcw0c:nth-child(1) .LC20lb:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}

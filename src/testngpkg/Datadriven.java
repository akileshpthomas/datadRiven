package testngpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
WebDriver driver;
@BeforeTest
public void beforetest()
{
	driver=new ChromeDriver();
}
@Test
public void test() throws Exception
{
	FileInputStream f=new FileInputStream("C:\\Users\\AKILESH P THOMAS\\Downloads\\book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("sheet1");
	int rowcount=sh.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username="+username);
		System.out.println("password="+password);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}
}

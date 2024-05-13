package pkg;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodetask {
ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test1() throws IOException
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("total number of links="+li.size());
	for(WebElement ele:li)
	{
		String link=ele.getAttribute("href");
		verify(link);
		//String linktext=ele.getText();
		//System.out.println(link+"-----------------"+linktext);
	}
}
private void verify(String link) throws IOException {
	try {
		URL ob=new URL(link);
	HttpsURLConnection con=(HttpsURLConnection)ob.openConnection();
	if(con.getResponseCode()==200)
	{
		System.out.println("successfull response code is 200-------"+link);
	}
	else if(con.getResponseCode()==404)
	{
		System.out.println("Failed response code is 404------"+link);
	}
	} catch (MalformedURLException e) {
		System.out.println("invalid");
	}
	
}
}
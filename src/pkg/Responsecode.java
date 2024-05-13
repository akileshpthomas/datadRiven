package pkg;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

public class Responsecode {
	String link="https://www.google.com";
@Test
public void test() throws IOException
{
	URL ob=new URL(link);
	HttpsURLConnection con=(HttpsURLConnection)ob.openConnection();
	int responsecode=con.getResponseCode();
	System.out.println(responsecode);
}
}

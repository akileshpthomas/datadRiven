package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbareatebtn;
	public Fbcreatepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	public void btnclick()
	{
		fbareatebtn.click();
	}
	public String titleveri()
	{
		String actualtitle=driver.getTitle();
		return actualtitle;
	}

}

package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
WebDriver driver;
@FindBy(id="email")
WebElement fbemail;

@FindBy(id="pass")
WebElement fbpass;

@FindBy(name="login")
WebElement fblogin;

public Fbloginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}




public void setvalues(String un,String pswd)
{
	fbemail.sendKeys(un);
	fbpass.sendKeys(pswd);
}
public void loginClick()
{
	fblogin.click();
}
}

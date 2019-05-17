package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {


	
@FindBy(xpath = "//select[@name='fromPort']")
public WebElement departureCityDropDown;


@FindBy(name="emailuser")
public WebElement Username;

@FindBy(name="emailpassword")
public WebElement Password;

@FindBy(name="email_submit_button")
public WebElement Submit;

@FindBy(id="logo2")
public WebElement Home;
			
}
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing_page {
	

	
@FindBy(xpath="//*[@id=\"homeHero\"]/div[2]/div[2]/span/a\r\n")
public WebElement Login;

@FindBy(xpath="//*[@id=\"homeHero\"]/div[2]/h1")
 public WebElement title;

@FindBy(xpath="//*[@id=\\\"block-block-1\\\"]/div/div/ul/li[1]/a")
public WebElement Header;


}









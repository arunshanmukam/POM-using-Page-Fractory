package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import page.Landing_page;
import page.Login_page;
import page.page_base;

public class Login_Test extends page_base //As We are Extends all the public Proprities and WebDriver aviable in the page_base will also aviable here
{
	@Test
	public void basePageNavigation() throws IOException
	{
		
		//PurchaseFlightPage ppg = PageFactory.initElements(driver, PurchaseFlightPage.class);

		
		
		Landing_page l= PageFactory.initElements(driver, Landing_page.class);    
		l.Login.click();  //driver.findElement(By.xpath()).click();

		Login_page lp= PageFactory.initElements(driver, Login_page.class);    
		lp.Username.sendKeys("ahicommercialqa@gmail.com");
		lp.Password.sendKeys("Password1");
		lp.Submit.click();
		lp.Home.click();
			
		
	}

}






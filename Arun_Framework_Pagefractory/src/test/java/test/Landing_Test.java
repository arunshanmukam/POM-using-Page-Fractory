package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import page.Landing_page;
import page.page_base;

public class Landing_Test extends page_base 
{	
	@BeforeTest //This will Execute first
	public void initialize() throws IOException
	{
		 driver =initializeDriver();		
		 driver.get(prop.getProperty("url"));
	}

@Test
public void validateAppTitle() throws IOException
{
	Landing_page l= PageFactory.initElements(driver, Landing_page.class);    
		
  l.title.getText();
  System.out.println(l.title.getText());
  Assert.assertEquals(l.title.getText(),"The #1 medical reference app");
		
//java.lang.AssertionError: expected [The #1 medical reference app] but found [The #1 medical reference app_Test]

}
	
	@AfterTest //This will Execute last to close the browser
	
	public void teardown()
	{
		driver.close();
	 
	}
}




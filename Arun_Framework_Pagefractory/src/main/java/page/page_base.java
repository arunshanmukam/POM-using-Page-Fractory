package page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class page_base {
	

		public static WebDriver driver; //Declared Globally to use the Home page using Extend (Inheritance) and it should in Static
		public Properties prop;
			
		public WebDriver initializeDriver() throws IOException 
		{
			prop= new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Arun\\eclipse-workspace\\Arun_Framework\\src\\main\\java\\config\\Config.property");

			prop.load(fis);
			String browserName=prop.getProperty("browser");
			System.out.println(browserName);
				
			if(browserName.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","F:\\\\Drivers\\\\chromedriver.exe");
			
		driver= new ChromeDriver();
		//execute in chrome driver
					
		}
				else if (browserName.equals("firefox"))
				{
					 driver= new FirefoxDriver();
					//firefox code
				}
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}


}

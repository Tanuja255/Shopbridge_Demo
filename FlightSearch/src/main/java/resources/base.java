package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
public WebDriver driver;
public WebDriver InitializeBrowser() throws IOException
{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("G:\\Tanuja_Data\\java_workspace\\FlightSearch\\src\\main\\java\\resources\\data.properties");
	
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Tanuja_Data\\java_workspace\\FlightSearch\\drivers\\chromedriver_95\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
}
}

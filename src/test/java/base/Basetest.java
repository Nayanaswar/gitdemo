package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest 
{
	public static WebDriver driver;
	public static Properties pr = new Properties();
	public static FileReader fr;
	public static Properties Loc = new Properties();
	public static FileReader fr1;
	
	@BeforeTest
	public void setup() throws IOException 
	{
		if(driver==null) 
		{
			 fr =new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfile/Config.properties");
			 fr1 =new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfile/locators.properties");
			
			pr.load(fr);
			Loc.load(fr1);
		}
		
		if(pr.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(pr.getProperty("testURL"));
		}
		
		else if (pr.getProperty("browser").equalsIgnoreCase("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(pr.getProperty("testURL"));
		}
		
		else if (pr.getProperty("browser").equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(pr.getProperty("testURL"));
		}
	}
	
	@AfterTest
	public void Teardown() 
	{
		driver.close();
		
		System.out.println("Teardown successful");
	}

}

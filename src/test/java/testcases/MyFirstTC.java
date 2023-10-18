package testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.Basetest;
import utilities.ReadXLSData;

public class MyFirstTC extends Basetest
{
	@Test(priority=1)
	public static void ClickOnElements() 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Loc.getProperty("Elements"))).click();
		System.out.println("Elements was clicked");	
		
	}
	
	
	
	

}

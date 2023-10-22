package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.Basetest;

import utilities.ReadXLSData;

public class MyFirstTC extends Basetest
{
	//common cm =new common()
    ReadXLSData ex = new ReadXLSData();

	
	
	@Test(priority=1)
	public void EnterDetails() throws EncryptedDocumentException, IOException 
	{
		WebElement ele1=driver.findElement(By.name("username"));
		ele1.click();
		ele1.clear();
		ele1.sendKeys(ex.getdata(1, 0));
	}
	
	
	
	 
}

package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Basetest;

public class common extends Basetest
{
	public static WebDriver driver;
	
	public void Click(String xpath) 
	{
		WebElement ele = driver.findElement(By.xpath("xpath"));
		ele.click();
	}

}

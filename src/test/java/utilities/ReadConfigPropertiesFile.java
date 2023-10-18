package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigPropertiesFile 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("C:\\Users\\nayan\\eclipse-workspace\\PracticeUITesting\\src\\test\\resources\\configfile\\Config.properties");
		
		Properties pr = new Properties();
		
		pr.load(fr);
		
		String browser = pr.getProperty("browser");
		System.out.println(browser);
		
		String testURL = pr.getProperty("testURL");
		System.out.println(testURL);
		
	}

}

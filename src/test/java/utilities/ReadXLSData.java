package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSData 
{
	public static String getdata(int rowindex, int cellindex) throws EncryptedDocumentException, IOException 
	{
		File file=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata");
		FileInputStream fs=new FileInputStream(file);
		  Workbook wb = WorkbookFactory.create(fs);
		   Sheet sheet=wb.getSheet("testdata");
		   String value = sheet.getRow(rowindex).getCell(cellindex).getStringCellValue();
		   System.out.println(value);
		   return value;
	}
	

}

package generic_libraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetExcelDATA 
{
	public static String getdata(String sheet, int row, int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	   FileInputStream fis = new FileInputStream("./Excel/data.xlsx");
	
	   Workbook wb = WorkbookFactory.create(fis);  // create() is to open the file
	   
	     Sheet sh = wb.getSheet(sheet);
	     
	      Row rw = sh.getRow(row);
	      
	       Cell c = rw.getCell(cell);
	       
	       String val = c.toString();
	       
	       return val;
	      
	     	     
	}
}

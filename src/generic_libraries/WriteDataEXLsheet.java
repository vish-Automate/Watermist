package generic_libraries;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataEXLsheet
{
    public void Writetext(String Sheet, int row, String val) throws EncryptedDocumentException, InvalidFormatException, IOException
    {

    	FileInputStream fis = new FileInputStream("./excel/github.xlsx");
    	
    	Workbook wb =  WorkbookFactory.create(fis);
    	
    	 Sheet sh = wb.getSheet(Sheet);
    	 
    	 Row r = sh.createRow(row);
    	 
    	 Cell c = r.createCell(1);
    	 
    	 c.setCellValue(val);
    	 
    	 
    	 
    	 FileOutputStream fos = new FileOutputStream("./excel/github.xlsx");
    	 
    	 wb.write(fos);
    	
    	
    	
    }
}

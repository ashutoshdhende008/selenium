package ABC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class hello {
	public String readDataFromExel(String sheet,int rownum, int colnum) throws EncryptedDocumentException, IOException{
		FileInputStream file = new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(file);
	String s	=wb.getSheet(sheet).getRow(rownum).getCell(colnum).toString();
	return s;
	
		
		
		
	}

}

package Generic_lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String sheet,int row,int cell)
	{
		String v="";
		
		
		try {
			FileInputStream fis = new FileInputStream("./Excel/data1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			Row r = sh.getRow(row);
			Cell c = r.getCell(cell);
			v=c.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
		}
		return v;
		
			
	}
		
	}



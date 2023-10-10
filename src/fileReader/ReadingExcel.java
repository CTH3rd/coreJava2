/**
 * 
 */
package fileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 */
public class ReadingExcel {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//this is the file I want to read
		File f = new File("C:\\filewriting\\myExcelFile.xlsx");
		//Open FileInputStream
		FileInputStream fis = new FileInputStream(f);
		//creating the workbook after the stream is opened
		Workbook wb = WorkbookFactory.create(fis);
	
		Sheet sht0 = wb.getSheetAt(0);
		
		 for(Row row : sht0) {
			 for(Cell cell: row) {
				 switch(cell.getCellType()) 
				 {
				 case STRING:
					 System.out.print(cell.getStringCellValue()+"\t");	
					 break;
				case NUMERIC:
					 System.out.print(cell.getNumericCellValue()+"\t");				
				case BLANK:
					System.out.print(cell.getNumericCellValue()+"\t");
				case BOOLEAN:
					break;
				case ERROR:
					break;
				case FORMULA:
					break;
				case _NONE:
					break;
				default:
					break;
			
				 }
			 }
			 System.out.println();
		 }
		
		
		
		//create start point to begin reading data. *This is the first cell first row only*
		
//		Row row0 = sht0.getRow(0);
//		Cell cellA = row0.getCell(0);
				
		//Print cell one data
		
		//Close Stream
		fis.close();
		
	}

}

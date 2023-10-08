package fileReader;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sht0 = wb.createSheet("1st Sheet");
		
//		Row row0 = sht0.createRow(0);
//		Cell cellA = row0.createCell(0);
//		Cell cellB = row0.createCell(1);
//		
//		cellA.setCellValue("First Cell");
//		cellB.setCellValue("Second Cell");
		
		for(int rows=0; rows<10; rows++) {
			Row row = sht0.createRow(rows);
			for(int cols=0; cols<10; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
			
		}
		
		//Connecting Streams
		File f = new File("C:\\filewriting\\myExcelFile.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		//Writing output 
		wb.write(fo);
		//close stream
		wb.close();
		 System.out.println("Writing to Excel Success!");
		
	}
}

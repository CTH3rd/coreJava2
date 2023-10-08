/**

 * 
 */
package fileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileWriter;


/**
 * 
 */
public class NotepadFileReader {

	/**
	 * @param args
	 * @throws IOException 	 * 
	 */
	public static void main(String[] args) throws  IOException{
		
		
		File f= new  File("C:\\filewriting\\myTest.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter("C:\\filewriting\\myTest.txt");
		BufferedWriter write = new BufferedWriter(fw); 
		//*One line for text use \n to create new line in the double quotes*
		fw.write("Write inside this file...?");
		fw.write("\\nSecond Line");
		
//		System.out.println("Text Doc Complete!");
		//read from a file
		FileReader fr = new FileReader("C:\\filewriting\\myTest.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		Scanner sc = new Scanner(System.in);		
		String i = "";
		
		while((i = sc.nextLine())!=null) {
			 
			
			System.out.println(i);
//			sc.close();
//			fw.flush();
		}
		

}
}
	
	
	
	

/**

 * 
 */
package fileReader;
import java.io.*;




/**
 * 
 */
public class NotepadFileReader {

	/**
	 * @param args
	 * @throws IOException 	 * 
	 */
	public static void main(String[] args) throws  IOException{
		
		try {
			 BufferedReader br = new BufferedReader(
					 new FileReader("C:\\filewriting\\myTest1.txt"));
			 //whileLoop to read all the lines in a txt document.
			 String s;
			 while((s = br.readLine()) !=null) {
				 System.out.println(s); 
			 }	
			 br.close();
			 System.out.println("Mission Complete!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		
		
		
		
		;
	
}
}
	
	
	
	

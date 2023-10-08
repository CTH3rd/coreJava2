package fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("C://filewriting//tempFile.txt");
			BufferedReader reader = new BufferedReader(fr);

			// read all txt in file
			//Create While Loop to iterate the document

			String ln = null;
			while ((ln = reader.readLine()) != null) {

				System.out.println(ln);
			}

			reader.close();
		} catch (IOException e) {
			System.out.println("Could Not Read file!!!");
			e.printStackTrace();
		}

	}

}

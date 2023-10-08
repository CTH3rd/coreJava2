import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {

		// Stream connection with FileWriter
		// Writing to txt,csv and html files

		try {
			FileWriter writer = new FileWriter("C://filewriting//tempFile.txt");
			writer.write("This is my first file!");
			writer.write("\nClifton");
			writer.write("\nThomas");
			writer.write("\nHackett III");
			writer.write("\nFayetteville,NC	28314");
			writer.write("\nAutomation Tester");
			writer.write("\n500000");
			writer.write("\n4yrs experience");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("File Created Successfully!!!");

		try {
			// Stream connection with FileWriter
			FileWriter writer1 = new FileWriter("C://filewriting//tempFile.xlsx");
			// writing inside the file
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					int num = (int) (Math.random() * 100);
					writer1.write(num + " ");

				}
			}

			writer1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("CSV File Successfully written!");

		try

		{
			// Stream Connection with FileWriter for HTML doc
			FileWriter writerH = new FileWriter("C://filewriting//tempFile.html");
			writerH.write(
					"<html><body><title>Automated HTML2023 </title><h1>Java to automate small tasks is Awesome!</h1> </body> </html>");

			writerH.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("HTML File Successfully created!");
	}

}

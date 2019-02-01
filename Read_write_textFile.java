import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_write_textFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/Selenium Stuff/temp.txt");
		f.createNewFile();
		
		//Writing into a text file
		FileWriter w = new FileWriter("C:\\Selenium Stuff\\temp.txt");
		BufferedWriter out = new BufferedWriter(w);
		out.write("Hello! We are writting in file");
		out.newLine();
		out.write("This is a new Line 1");
		out.newLine();
		out.write("This is a new Line 2");
		out.newLine();
		out.write("This is a new Line 3");
		out.newLine();
		out.write("This is a new Line 4");
		out.newLine();
		//out.flush();   This command is used to write the data in a text file.
		out.close();
		
		//Reading from the a text file
		FileReader r = new FileReader("C:/Selenium Stuff/temp.txt");
		BufferedReader rd = new BufferedReader(r);
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
		String Line;
		int i = 0;
		while((Line = rd.readLine()) != null) {
			System.out.println(Line);
			i++;
		}
	
		System.out.println(i);
	}

}

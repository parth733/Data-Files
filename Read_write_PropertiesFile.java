import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_write_PropertiesFile {

	public static void main(String[] args) throws IOException {
	
		// Read properties file
		FileInputStream fis = new FileInputStream("C:/Selenium Stuff/prop.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("testSiteName"));
		System.out.println(prop.getProperty("environment"));
		
		//This command will write value only in "temporary memory".
		prop.setProperty("last", "Parth");
		System.out.println(prop.getProperty("last"));
		
		prop.setProperty("first", "Patel");
		System.out.println(prop.getProperty("first"));
		
		// This command will write values in actual "Properties File"
		FileOutputStream fos = new FileOutputStream("C:/Selenium Stuff/prop.properties");
		prop.store(fos, "Adding files"); // "Adding files" will be comment. 
		
	}

}

package parallel_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Properties p = new Properties();
		
		p.load(new FileInputStream("./p.properties"));
		
		String data = p.getProperty("country");
		System.out.println(data);
			
	}

}

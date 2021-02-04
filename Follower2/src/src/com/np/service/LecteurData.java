package src.com.np.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class LecteurData {

	
	Properties prop = new Properties();
	

	public Properties lireFichierData(String monfichierconfig)  {
		// make new properties instance to load the file into
		

		// check to make sure the file exists
		String location = getClass().getResource(monfichierconfig).getFile();
		System.out.println("location du fichier " + location);
		File file = new File(location);

		if (file.exists()){
			// load the file in the property
			try {
				prop.loadFromXML(new FileInputStream(file));
				
			} catch (InvalidPropertiesFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			// print out all the properties
			
		} else {
			System.err.println("Error: No file found at: " + location);
		}
		return prop;


	}
}

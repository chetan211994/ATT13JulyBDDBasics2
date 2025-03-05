package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

	public String readPropData(String propToBeRead) throws IOException {
		Properties prop = new Properties();

		String pathOfConfig = System.getProperty("user.dir") + "//src//test//resources//Config.properties";

		FileInputStream fis = new FileInputStream(pathOfConfig);

		prop.load(fis);

		String value = prop.getProperty(propToBeRead);

		System.out.println(value);
		
		return value;

	}
	

}

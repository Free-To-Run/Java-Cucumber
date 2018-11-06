package testing.cucumber.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	// Initialize Variables
	private static TestProperties testProperties = null;
	private static Properties properties = null; 
	
	// Singleton implementation.
	/**
	 * Private Constructor - Loading properties for Properties file
	 * @throws IOException
	 */
	private TestProperties() throws IOException{
		properties = new Properties();
		this.loadProperties();
	}
	
	/**
	 * Get the instance of TestProperties to access the properties defined in TestPropties.property file.
	 * @return Single Instance of TestProperties
	 * @throws IOException
	 */
	public static TestProperties getInstance() throws IOException{
		if(testProperties == null){
			testProperties = new TestProperties();
		}
		return testProperties;
	}
	
	/**
	 * Load properties from properties file
	 * @throws IOException 
	 */
	private void loadProperties() throws IOException{
		File fileProperties = new File(System.getProperty("user.dir") + "/Input/TestProperty.properties");
		FileInputStream fisProperties = new FileInputStream(fileProperties);
		properties.load(fisProperties);
		fisProperties.close();
	}
	
	/**
	 * Return 
	 * @param key
	 * @return
	 */
	public String getProperty(String key){
		return properties.getProperty(key);
	}

}

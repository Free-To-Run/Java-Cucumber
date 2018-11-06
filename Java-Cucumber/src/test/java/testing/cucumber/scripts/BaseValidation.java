package testing.cucumber.scripts;

import org.openqa.selenium.remote.RemoteWebDriver;

import testing.cucumber.utilities.TestProperties;

/**
 * @description A base case in which the Page Factory objects and all objects related to 
 * common usage for script method with be defined.
 * @author Ratnadip Chaudhuri
 */
public class BaseValidation {
	
	// Initiate all variable to be used across script files.
	protected RemoteWebDriver driver = null;
	protected TestProperties testProperties = null;
	
	public BaseValidation() throws Throwable{
		testProperties = TestProperties.getInstance();
	}
	
	public void initializeWebDriver(){
		
	}
}

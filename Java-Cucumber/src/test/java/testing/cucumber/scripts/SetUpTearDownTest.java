package testing.cucumber.scripts;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SetUpTearDownTest extends BaseValidation {

	public SetUpTearDownTest() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void setUpMethod(){
		System.out.println(testProperties.getProperty("ApplicationURL"));
	}
	
	@After
	public void tearDownMethod(){
		
	}

}

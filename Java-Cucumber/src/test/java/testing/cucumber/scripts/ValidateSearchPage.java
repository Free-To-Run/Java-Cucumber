package testing.cucumber.scripts;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ValidateSearchPage extends BaseValidation {

	public ValidateSearchPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}


	@Given("^Launch Application and wait for the page to load\\.$")
	public void launch_Application_and_wait_for_the_page_to_load() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("In Launch App");
	}

	@Then("^Validate the Google Logo\\.$")
	public void validate_the_Google_Logo() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Validate that Search field is available\\.$")
	public void validate_that_Search_field_is_available() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Validate that \"([^\"]*)\" button is available\\.$")
	public void validate_that_button_is_available(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}



}

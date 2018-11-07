package testing.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty", "json:target/cucumber.json"},
		snippets=SnippetType.CAMELCASE,
		monochrome=true,
		features={"./src/test/resources/features"},
		glue = {"testing.cucumber.scripts"}
)
public class CucumberTestRunner {

}

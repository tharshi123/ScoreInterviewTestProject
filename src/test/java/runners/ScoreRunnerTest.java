package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = { "src/test/resources/Features"},
		glue = {"StepDefinition","BaseStep"},
		tags = "@tag6",
		plugin = {"pretty","json:target/cucumber.json", "html:target/cucumber-html-report"}
		
		
		)
		
	
public class ScoreRunnerTest extends AbstractTestNGCucumberTests {
	
}

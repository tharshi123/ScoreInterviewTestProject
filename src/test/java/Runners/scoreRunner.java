package Runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = { "src/test/resources/Features"},
		glue = {"StepDefinition","BaseStep"},
		tags = "@tag6",
		plugin= {"pretty"}
		)
		
	
public class scoreRunner {

}

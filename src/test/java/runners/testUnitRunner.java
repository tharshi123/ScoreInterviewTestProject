package Runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = { "src/test/resources/Features"},
		glue = {"StepDefinition","BaseStep"},
		tags = "@tag9",
		plugin= {"pretty"}
		//plugin = {"pretty","json:target/Reports/Search.json","html:target/Reports/Search.html",
		  //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		
		)
		
public class testUnitRunner {

}

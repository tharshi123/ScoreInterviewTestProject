package StepDefinition;

import org.testng.Assert;

import BaseStep.BaseClass;
import Pages.ChooseLeagues;
import Pages.WelcomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef_TC001 {

	WelcomePage wObj = new WelcomePage();
	ChooseLeagues clObj = new ChooseLeagues();
	
	
	@Given("I am landed on ScoreMedia app")
	public void i_am_landed_on_score_media_app() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I am landedn on ScoreMedia app");
	   Boolean result = wObj.verifyItIsWelcomePage();
	   Assert.assertTrue(result);
	}
	
	
	@When("I click getStarted button")
	public void i_click_get_started_button() {
		
		wObj.clickGetStartButton();
	}
	

	@Then("I should be landed on ChooseYourLeagues page")
	public void i_should_be_landed_on_choose_your_leagues_page() {
	
		String header = clObj.getChooseLaguesPgHeader();
	   Assert.assertEquals(header,"Choose your favorite leagues");
	   System.out.println("I am landed on Choose Your leagues page");
	}
	
}

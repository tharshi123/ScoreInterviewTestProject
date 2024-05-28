package StepDefinition;

import org.junit.Test;
import org.testng.Assert;

import BaseStep.BaseClass;
import Pages.BetIsLiveWindow;
import Pages.ChooseFavTeam;
import Pages.ChooseLeagues;
import Pages.CommonComponents;
import Pages.TeamPlayersNewPage;
import Pages.WelcomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.PropertiesReader;

public class stepDef_TC001 {

	WelcomePage oWelcome = new WelcomePage();
	ChooseLeagues oCFL = new ChooseLeagues();
	
	ChooseFavTeam oCFT = new ChooseFavTeam();
	BetIsLiveWindow oBL = new BetIsLiveWindow();
	TeamPlayersNewPage oTPN = new TeamPlayersNewPage();
	CommonComponents oCC = new CommonComponents();

	public static String favLeaguesGamesDataFile = "LeaguesAndGames";
	public static String favLeagueKey = "favLeagues";
	public static String favTeamKey = "favTeam";

	@Given("I am landed on ScoreMedia app")
	public void i_am_landed_on_score_media_app() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am landedn on ScoreMedia app");
		Boolean result = oWelcome.verifyItIsWelcomePage();
		Assert.assertTrue(result);
	}

	@Given("I am landed on Fav TeamPage")
	public void i_am_landed_on_fav_teampage() {
		
		oWelcome.clickGetStartButton();
		oCC.clickContineuButton();

		String title = oCC.getThePgTitle();
		Assert.assertEquals(title, "Choose your favorite teams");
		System.out.println("I am landedn on 'Choose your favorite teams' page!!! ");
	}

	@When("I click getStarted button")
	public void i_click_get_started_button() {

		oWelcome.clickGetStartButton();
	}

	@Then("I should be landed on ChooseYourLeagues page")
	public void i_should_be_landed_on_choose_your_leagues_page() {

		String header = oCC.getThePgTitle();
		Assert.assertEquals(header, "Choose your favorite leagues");
		System.out.println("I am landed on Choose Your leagues page");

	}

	@Then("I should be landed on ChooseYourFavTeam page")
	public void i_should_be_landed_on_choose_your_fav_team_page() {

		String header = oCC.getThePgTitle();
		Assert.assertEquals(header, "Choose your favorite teams");
		System.out.println("I am landed on Choose your favorite teams page");

	}

	@Then("I should be landed on NeverMissAGame page")
	public void i_should_be_landed_on_never_miss_a_game_page() {

		String header = oCC.getThePgTitle();
		Assert.assertEquals(header, "Never miss a game");
		System.out.println("I am landed on Never miss a game page");

	}

	@Then("I should be landed on IntroduceScoreMsg page")
	public void i_should_be_landed_on_introduce_score_msg_page() {

		String header = oCC.getThePgTitle();
		Assert.assertEquals(header, "Introducing theScore Messaging!");
		System.out.println("I am landed on Introducing theScore Messaging! page");

	}

	@When("I click on my FavLeague")
	public void i_click_on_my_fav_league() {
		oCFL.selectFavLeagues(favLeaguesGamesDataFile, favLeagueKey);
	}

	@When("I click on my FavTeam")
	public void i_click_on_my_fav_team() {
		oCFT.selectFavTeam(favLeaguesGamesDataFile, favTeamKey);
	}

	@When("I click the Continue button")
	public void i_click_the_continue_button() {
		oCC.clickContineuButton();
	}

	@When("I select the Do not allow notification button from pop up window")
	public void i_select_the_do_not_allow_notification_button_from_pop_up_window() {
		oCC.clickDoNotAllowInPopUp();
	}

	@Then("Bet is Live window opened")
	public void bet_is_live_window_opened() {
		//skipping this - i will implement the validation later
	}

	@When("I close the Bet is Live window")
	public void i_close_the_bet_is_live_window() {
		oBL.dismissTheModalWindow();
	}

	@When("I clcik teh maybeLater for Email SignUp")
	public void i_clcik_teh_maybe_later_for_email_sign_up() {
		oCC.clickMayBeLaterForEmailSignUp();
	}

	@Then("i should be lanaded on Team Player news page")
	public void i_should_be_lanaded_on_team_player_news_page() {
		oCC.clickMayBeLaterForEmailSignUp();
		oCC.clickDoNotAllowInPopUp();// closing the Notification allow pop=up if it is opened

		oCC.clickDoNotAllowInPopUp();
		oBL.dismissTheModalWindow();
		oCC.clickMayBeLaterForEmailSignUp();
		Boolean isSearchBarDisplayed = oTPN.isNewsSearchBoxDisplayed();
		Assert.assertTrue(isSearchBarDisplayed);
		System.out.println("Team Player news page");

	}
	
	@When("I click the TeamLogo")
	public void i_click_the_team_logo() {
		oTPN.clickTeamLogo();
		
	}
	
	
	@Then("I should be landed on selectedTeamPage")
	public void i_should_be_landed_on_selected_team_page() {
		//reading Fav team name from properties file (data)
		String expectedTeamName = PropertiesReader.getPropertyValue(favLeaguesGamesDataFile, favTeamKey);
		String withoutDoubleQuatos = expectedTeamName.replace("\"", "");
		
		//trying close the pop up/ modal windows if it is populated.
		oCC.clickDoNotAllowInPopUp();
		oCC.closePopUp();
		
		//validating the selecting task
		String teamNamePageTitle = oTPN.getTeamName();
		Assert.assertEquals(teamNamePageTitle, withoutDoubleQuatos);
		System.out.println("I am landed on " +withoutDoubleQuatos+" Team page");
		
	}



	

}

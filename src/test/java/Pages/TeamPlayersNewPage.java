package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;
import util.PropertiesReader;

public class TeamPlayersNewPage extends BaseClass{
	

	//private By mayBeLinkInPopUp = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/btn_disallow\"]");
//	private By tailorPopup = By.xpath("//android.view.ViewGroup");
//	private By continueButton= By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/action_button_text\"]");
//	private By pgTitle = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/title_onboarding\"]");
	//private By selectedTeamDisplayed = By.xpath("//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/icon_team_logo\"]");
	
	private By newsSearchBox = By.id("com.fivemobile.thescore:id/search_bar_text_view");
	private By teamLogo	= By.id("com.fivemobile.thescore:id/icon_team_logo");
	private By teamName = By.id("com.fivemobile.thescore:id/team_name") ;
	
	public boolean isNewsSearchBoxDisplayed () {
		return driver.findElement(newsSearchBox).isDisplayed();
	}
	
	
	public void clickTeamLogo() {
		driver.findElement(teamLogo).click();
	}
	
	public String getTeamName() {
		
		return driver.findElement(teamName).getText();
	}
	
}

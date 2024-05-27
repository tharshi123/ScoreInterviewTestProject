package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;
import util.PropertiesReader;

public class TeamPlayersNewPage extends BaseClass{
	
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

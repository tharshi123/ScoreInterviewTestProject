package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;

public class ChooseLeagues extends BaseClass{
	
	
	//private AppiumDriver driver;
	private By pgHeader = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/title_onboarding\"]");
	private By availableLeagues = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\"]");
	private By mayBeLater = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/btn_disallow\"]");
	private By tailorPopup = By.xpath("//android.view.ViewGroup");
	//public List listOfLeaques = new List()

	String leagueNames[] = {"NHL Hockey", "NFL Football", "MLB Baseball","NBA Basketball"};
	//System.out.println(Arrays.toString(leagueNames));
			
			
	/*
	 * public ChooseLeagues(AppiumDriver driver) {
	 * System.out.println("User landed on Choose Your Leagues page ");
	 * 
	 * }
	 */
	
	public boolean verifyChooseLeaguePg() {
		 
		if(driver.findElement(pgHeader).isDisplayed() &&
				driver.findElement(availableLeagues).isDisplayed())
			{
				return true;
						
			}
			else {
				return false;
			}
		
	}
	
	
	public boolean isTailorpopUpDisplayd() {
		
		return driver.findElement(tailorPopup).isDisplayed();
		
	}
	
	public void clickMayBeLaterInPopup() {
		
		if(isTailorpopUpDisplayd()) {
			
		System.out.println("PopUp opened!");
		//closing the pop up by clicking the maybe Link
		driver.findElement(mayBeLater).click();
		}
		else {
			System.out.println("Pop up is not displaying ");
		}
		
	}
	
	public String getChooseLaguesPgHeader() {
		clickMayBeLaterInPopup();
		String header = driver.findElement(pgHeader).getText();
		  System.out.println("==========CHOOSE LEAGUES HEADER:  "+header);
		  return header;
	}
	
	/*
	 * public boolean verifyAllLeaguesNames() {
	 * 
	 * List<String> leagues = new ArrayList<String>(); List <WebElement> allLeagues
	 * = driver.findElements(availableLeagues);
	 * System.out.println("========  Numbefr of leaques: ======"+allLeagues.size());
	 * 
	 * for(WebElement e: allLeagues) { System.out.println(e.getText());
	 * leagues.add(e.getText());
	 * 
	 * 
	 * } return ((leagues.contains(leagueNames))); }
	 */

}

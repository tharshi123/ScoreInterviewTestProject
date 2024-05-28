package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;
import util.PropertiesReader;

public class ChooseLeagues extends BaseClass{
	
	 
	
	
	public void selectFavLeagues(String fileName, String key) {
		//Reading Fav leagues from data file
		String leagueName = PropertiesReader.getPropertyValue(fileName, key);
		System.out.println("*FavLeague name Read from properties file**:  "+ leagueName);
		
		String favLeagueXpath= "//android.widget.TextView[@text="+leagueName+"]";
		//System.out.println("***** " +favLeagueXpath);
		
		driver.findElement(By.xpath(favLeagueXpath)).click();
	}

	
	
	 public boolean isLeagueSelected() {
		
		 return true;
		 
	 }
	 
		

	
	 
	 
}

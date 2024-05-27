package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;
import util.PropertiesReader;

public class ChooseLeagues extends BaseClass{
	

	/*
	 * public String getFavLeagueTitle() {
	 * 
	 * //if pop-up opened, then close it // closePopUp(); //verify the tab name
	 * 
	 * ///String title =driver.findElement(chooseFavLeagueTab).getText(); String
	 * pgTitle =oCC.getThePgTitle(); System.out.println("Tab name is : "+
	 * driver.findElement(chooseFavLeagueTab).getText()); return title;
	 * 
	 * }
	 */
	 
	
	
	public void selectFavLeagues(String fileName, String key) {
		//Reading Fav leagues from data file
		String leagueName = PropertiesReader.getPropertyValue(fileName, key);
		System.out.println("*****FavLeague name****:  "+ leagueName);
		
		String favLeagueXpath= "//android.widget.TextView[@text="+leagueName+"]";
		System.out.println("***** " +favLeagueXpath);
		
		driver.findElement(By.xpath(favLeagueXpath)).click();
	}

	
	
	 public boolean isLeagueSelected() {
		
		 return true;
		 
	 }
	 
		

	
	 
	 
}

package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;
import util.PropertiesReader;

public class ChooseFavTeam extends BaseClass{
	

	
	
	 public void selectFavTeam(String fileName, String key) {
			
			//Reading fav Team name from Data file
		 	String teamName = PropertiesReader.getPropertyValue(fileName, key);
			System.out.println("**Fav Team name, read from data file***:  "+ teamName);
	
			
			String favTeamXpath= "//android.widget.TextView[@text="+teamName+"]";
					
			driver.findElement(By.xpath(favTeamXpath)).click();
		
		}
	 
	 
	 
	 
}

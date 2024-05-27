package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;
import util.PropertiesReader;

public class IntroduceToScoreMsg extends BaseClass{
	

	private By mayBeLaterLink = By.id("com.fivemobile.thescore:id/btn_secondary");

	
	public void clickMayBeLater() {
		driver.findElement(mayBeLaterLink).click();
		System.out.println("MaybbeLater link is clicked in Introduce Score msg page");
		
	}
	 
	 
	 
}

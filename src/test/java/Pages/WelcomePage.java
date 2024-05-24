package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;


public class WelcomePage extends BaseClass{

	
	private By welcomeText = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_welcome\"]");
	private By appExpText = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_app_exp\"]");
	private By loginLink = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_sign_in\"]");
	private By getStartButton = By.xpath("//android.view.ViewGroup[@resource-id=\"com.fivemobile.thescore:id/btn_primary\"]");
	

			
	public boolean verifyItIsWelcomePage() {
				
		if(driver.findElement(welcomeText).isDisplayed() &&
			driver.findElement(appExpText).isDisplayed()&&
			driver.findElement(loginLink).isDisplayed()&&
			driver.findElement(getStartButton).isDisplayed())
		{
			return true;
					
		}
		else {
			return false;
		}
	
				
	}
	
	public String getWelcomeMsg(){
			
		String title = driver.getTitle();
		System.out.println("Landing page title"+title );
		return title;
	
	}
	public void clickGetStartButton(){
		System.out.println("I am clicking the Get Start button here ....");
		driver.findElement(getStartButton).click();
		
	
	}
			
	/*
	 * public ChooseLeaques clickGetStartedButton() {
	 * driver.findElement(getStartButton).click(); return new ChooseLeaques(driver);
	 * }
	 * 
	 */
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;


public class WelcomePage extends BaseClass{

	
	private By welcomeText = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_welcome\"]");
	private By appExpText = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_app_exp\"]");
	private By loginLink = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_sign_in\"]");
	private By getStartButton = By.xpath("//android.view.ViewGroup[@resource-id=\"com.fivemobile.thescore:id/btn_primary\"]");
	//private By mayBeLinkInPopUp = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/btn_disallow\"]");
  //  private By loginLink = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_sign_in\"]");
  
    CommonComponents oCC =new CommonComponents();
			
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
		oCC.closePopUp();
		String title = driver.getTitle();
		System.out.println("Landing page title"+title );
		return title;
	
	}
	public void clickGetStartButton(){
		oCC.closePopUp();
		System.out.println("I am clicking the Get Start button here ....");
		driver.findElement(getStartButton).click();
		
	
	}
			
	
	
	/*
	 * //we can have this in common component page.. but right now i am having it in
	 * individual pages public void closePopUp() {
	 * 
	 * //verify that the pop-up is displayed or not/ here i am checking the may be
	 * link from Pop-up window
	 * 
	 * try {
	 * 
	 * WebElement maybeLink = driver.findElement(mayBeLinkInPopUp);
	 * 
	 * System.out.println("Pop-up is  displaying in Wecome Page ");
	 * maybeLink.click();
	 * 
	 * }
	 * 
	 * catch (Exception e ) {
	 * 
	 * System.out.println("Pop-upis not displaying in Welcome page "); //
	 * System.out.println(e.getMessage());
	 * 
	 * } }
	 */
}

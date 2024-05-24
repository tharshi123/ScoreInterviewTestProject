import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class AppiumTest3 {

	
	static AppiumDriver  driver;
	
	public static void main(String[] args) {

		try {
			call();

		} catch (Exception exp) {
			exp.getCause();
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}

	public static void call()  throws MalformedURLException{

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformVersion", "14.0");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.fivemobile.thescore");
		caps.setCapability("appActivity", ".ui.MainActivity");
	    caps.setCapability("automationName", "UiAutomator2");

	    URL url = new URL("http://127.0.0.1:4723");
		
		//driver = new AppriumDriver<MobileElement>(new URL("http://127.0.0.1:4723"), caps);
		
		driver = new AndroidDriver(url,caps);
        System.out.println("App started");
		
		

		WebElement statButton = driver.findElement(By.id("com.fivemobile.thescore:id/action_button_text"));
		statButton.click();
        
        
        
        
        String game_widget = "com.fivemobile.thescore:id/recyclerView";
		// List<WebElement> gameNamesElements=
		// driver.findElement(By.id(game_widget)).findElements(By.xpath("//android.widget.TextView"));
		List<WebElement> gameNames = driver.findElements(By.id(game_widget));

		 System.out.println("**************");
		  for(WebElement game : gameNames) {
			  System.out.println("***************" + game.getText());
		  }
		 
		//WebElement gameNamesElements = driver.findElement(By.id(game_widget));

		

		// driver.quit();
		//driver.close();
	}

}

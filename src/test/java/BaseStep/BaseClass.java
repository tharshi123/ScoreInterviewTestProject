package BaseStep;


import java.net.URL;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;

import org.openqa.selenium.TakesScreenshot;

public class BaseClass {
	
	
	public static AppiumDriver driver;
	
	

	@Before
	public static void loadApp() throws Exception {
		
		
		System.out.println("Before class : we setting up the driver and opennign teh app here!");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformVersion", "14.0");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.fivemobile.thescore");
		caps.setCapability("appActivity", ".ui.MainActivity");
	    caps.setCapability("automationName", "UiAutomator2");

		try {
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
			

		
		} catch(SessionNotCreatedException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	

	
	@After
	public static void closeBrowser(Scenario scenario) {
		
		
		if(scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "FailedTestScreenshot");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//closing the driver
		System.out.println("After class : we are closing the driver!");
		
		driver.quit();

       
		
	}
	

}
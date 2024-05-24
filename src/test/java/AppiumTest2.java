import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class AppiumTest2 {

	public static void main(String[] args) {

		try {
			call();

		} catch (Exception exp) {
			exp.getCause();
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}

	public static void call() throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformVersion", "14.0");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.fivemobile.thescore");
		caps.setCapability("appActivity", ".ui.MainActivity");
	    caps.setCapability("automationName", "UiAutomator2");

		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
		
		
		
		System.out.println("Application started..");

		//clicking teh stat button
		driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.fivemobile.thescore:id/btn_primary\"]")).click();
		
		
		//String game_widget = "com.fivemobile.thescore:id/recyclerView";
		/*
		 * // List<WebElement> gameNamesElements= //
		 * driver.findElement(By.id(game_widget)).findElements(By.xpath(
		 * "//android.widget.TextView")); List<WebElement> gameNames =
		 * driver.findElements(By.id(game_widget));
		 * 
		 * System.out.println("**************"); for(WebElement game : gameNames) {
		 * System.out.println("***************" + game.getText()); }
		 * 
		 * //WebElement gameNamesElements = driver.findElement(By.id(game_widget));
		 * 
		 */

		//select the NHL Hockey
		
		WebElement myGame= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\" and @text=\"NHL Hockey\"]"));
		myGame.click();
		System.out.println("====The NHL Hockey os selecetd....");
		
		
		//click the continue button
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@resource-id=\"com.fivemobile.thescore:id/btn_primary\"]")));
		WebElement continueButton = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.fivemobile.thescore:id/btn_primary\"]"));
		continueButton.click();
		System.out.println("....Continue button is being clicked....");
		//click maybe later link (after wait for that element)
		/* WebDriverWait wait = new WebDriverWait(driver, 10);

		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/btn_disallow\"]")));
		*/
		
		WebElement mayBeLink = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/btn_disallow\"]"));
		mayBeLink.click();
		System.out.println("....Maybe links is being clicked....");
		// driver.qu();
		//driver.close();
	}

}

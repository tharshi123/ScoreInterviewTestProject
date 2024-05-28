package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;
import io.appium.java_client.AppiumDriver;
import util.PropertiesReader;

public class BetIsLiveWindow extends BaseClass {



	private By closeButtonInModalWindow = By.id("com.fivemobile.thescore:id/dismiss_modal");

	public boolean scoreBetLiveWindowOpened() {

		boolean modaWindowOpened = false;
		try {
			// instead of pop up window i am testing pop up close button here
			driver.findElement(closeButtonInModalWindow);

			System.out.println("Score Live Bet modal window displaying");
			modaWindowOpened = true;

		}

		catch (Exception e) {

			System.out.println("Score Live Bet modal window is not displaying ");
			// System.out.println(e.getMessage());

		}

		return modaWindowOpened;
	}

	public void dismissTheModalWindow() {
		// System.out.println("+++++++++++++++ Tryint to close the Modal window ");
		if (scoreBetLiveWindowOpened()) {
			driver.findElement(closeButtonInModalWindow).click();
			System.out.println("Modal window gets closed");
		}
	}

}

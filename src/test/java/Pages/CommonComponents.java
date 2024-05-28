package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseStep.BaseClass;

public class CommonComponents extends BaseClass {

	// common elements/features throughout the flow
	private By continueButton = By.id("com.fivemobile.thescore:id/action_button_text");
	private By mayBeLinkInPopUp = By.id("com.fivemobile.thescore:id/btn_disallow");
	private By pgTitle = By.id("com.fivemobile.thescore:id/title_onboarding");
	private By permissionDenyButton = By.id("com.android.permissioncontroller:id/permission_deny_button");
	private By laterForEmailSignUp = By.id("com.fivemobile.thescore:id/btn_secondary");
	private By closeButtonInModalWindow = By.id("com.fivemobile.thescore:id/dismiss_modal");
	
	public void clickContineuButton() {

		driver.findElement(continueButton).click();
		closePopUp();
		clickDoNotAllowInPopUp();
		dismissTheModalWindow();
	}

	public void closePopUp() {

		// verify that the pop-up is displayed or not/ here i am checking the may belink
		// from Pop-up window

		try {

			WebElement maybeLink = driver.findElement(mayBeLinkInPopUp);

			System.out.println("Pop-up is displaying");
			maybeLink.click();

		}

		catch (Exception e) {

		}

	}

	public String getThePgTitle() {

		closePopUp();
		return driver.findElement(pgTitle).getText();

	}

	public boolean notificationAlertWindowOpened() {

		boolean alertWindowOpened = false;
		try {

			driver.findElement(permissionDenyButton);

			System.out.println("Alert window  displaying  ");
			alertWindowOpened = true;

		}

		catch (Exception e) {

		}

		return alertWindowOpened;
	}

	public void clickDoNotAllowInPopUp() {

		if (notificationAlertWindowOpened()) {
			driver.findElement(permissionDenyButton).click();
		}

	}

	public void clickMayBeLaterForEmailSignUp() {

		boolean emailSignUp = false;
		try {

			driver.findElement(laterForEmailSignUp);

			System.out.println("EmailSign up is displaying  ");
			emailSignUp = true;
		} catch (Exception e) {

		}

		// Clicking the May be later link for Email Sign Up

		if (emailSignUp) {
			driver.findElement(laterForEmailSignUp).click();
		}
	}

	
	
	

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
		
		if (scoreBetLiveWindowOpened()) {
			driver.findElement(closeButtonInModalWindow).click();
			System.out.println("Modal window gets closed");
		}
	}

	
}

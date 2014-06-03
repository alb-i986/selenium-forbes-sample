package me.alb_i986.selenium.forbes.lib.gui.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends PageBase {

	private static final String EXPECTED_TITLE = "Information for the World's Business Leaders - Forbes.com";
	
	public HomePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}
	
	public static HomePage get(WebDriver driver) {
		driver.get(BASE_URL);
		return new HomePage(driver, null);
	}
	
	@Override
	protected void waitUntilIsLoaded() {
		PageHelper.ExplicitlyWait.until(ExpectedConditions.titleIs(EXPECTED_TITLE), driver);
	}

}


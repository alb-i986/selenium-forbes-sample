package me.alb_i986.selenium.forbes.lib.gui.pages;

import org.junit.Assert;
import org.openqa.selenium.*;


public class HomePage extends PageBase {

	private static final String expectedTitle = "Information for the World's Business Leaders - Forbes.com";
	
	public HomePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}
	
	public static HomePage get(WebDriver driver) {
		driver.get(BASE_URL);
		return new HomePage(driver, null);
	}
	

	@Override
	protected void load() {
		super.load();
		driver.get(BASE_URL);
	}

	@Override
	protected void isLoaded() throws Error {
		Assert.assertEquals("title does not match", expectedTitle, getTitle());
	}

}

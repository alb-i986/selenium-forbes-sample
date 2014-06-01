package me.alb_i986.selenium.forbes.lib.gui.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase {

	public static final String expectedTitle = "Information for the World's Business Leaders - Forbes.com";
	
	public HomePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}

	@Override
	protected void load() {
		driver.get(BASE_URL);
		super.load();
	}

	@Override
	protected void isLoaded() throws Error {
		Assert.assertEquals("title does not match", expectedTitle, getTitle());
	}

}

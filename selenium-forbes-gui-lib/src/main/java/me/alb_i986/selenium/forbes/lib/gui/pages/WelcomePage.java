package me.alb_i986.selenium.forbes.lib.gui.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends PageBase {

	@FindBy(css = "a.continue")
	private WebElement continueLink;
	
	public WelcomePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}

	public void clickContinue() {
		continueLink.click();
	}
	
	@Override
	protected void isLoaded() throws Error {
		Assert.assertEquals("title does not match", "Welcome to Forbes", getTitle());
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		super.load();
	}
	
	

}

package me.alb_i986.selenium.forbes.lib.gui.pages;

import me.alb_i986.selenium.tinafw.pages.Page;
import me.alb_i986.selenium.tinafw.pages.PageHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends PageBase {

	private static final String EXPECTED_TITLE = "Welcome to Forbes";
	
	@FindBy(css = "a.continue")
	private WebElement continueLink;
	
	public WelcomePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}

	public void clickContinue() {
		continueLink.click();
	}
	
	@Override
	protected void waitUntilIsLoaded() {
		PageHelper.waitUntil(ExpectedConditions.titleIs(EXPECTED_TITLE), driver);
	}
	
}

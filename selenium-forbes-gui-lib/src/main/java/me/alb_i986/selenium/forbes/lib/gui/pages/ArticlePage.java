package me.alb_i986.selenium.forbes.lib.gui.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends PageBase {

	@FindBy(css = "#abovefold div.article")
	private WebElement articleDiv;
	
	public ArticlePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}


	@Override
	protected void waitUntilIsLoaded() {
		PageHelper.ExplicitlyWait.untilElementIsVisible(articleDiv, driver);
	}

}

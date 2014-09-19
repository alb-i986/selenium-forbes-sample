package me.alb_i986.selenium.forbes.lib.gui.pages;

import me.alb_i986.selenium.tinafw.pages.Page;
import me.alb_i986.selenium.tinafw.pages.PageHelper;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArticlePage extends PageBase {

	@FindBy(css = "#abovefold div.article")
	private WebElement articleDiv;
	
	public ArticlePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}


	@Override
	protected void waitUntilIsLoaded() {
		PageHelper.waitUntil(ExpectedConditions.visibilityOf(articleDiv), driver);
	}

}

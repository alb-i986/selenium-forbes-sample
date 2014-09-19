package me.alb_i986.selenium.forbes.lib.gui.pages;

import me.alb_i986.selenium.forbes.lib.gui.pages.components.TopNavBar;
import me.alb_i986.selenium.tinafw.pages.Page;

import org.openqa.selenium.*;

public abstract class PageBase extends Page {
	
	private TopNavBar topNavBar;
	
	public PageBase(WebDriver driver, Page previous) {
		super(driver, previous);
		topNavBar = new TopNavBar(driver, this);
	}
	

	/**
	 * @see TopNavBar#gotoHome()
	 */
	public HomePage gotoHome() {
		return topNavBar.gotoHome();
	}
	
	public TopNavBar getTopMenu() {
		return topNavBar ;
	}
	
}

package me.alb_i986.selenium.forbes.lib.gui.pages;

import me.alb_i986.selenium.forbes.lib.gui.pages.components.TopMenu;

import org.openqa.selenium.*;

public interface Page {
	
	public Page gotoBack();
	public Page gotoHome();

	public TopMenu getTopMenu();
	
	/**
	 * @see WebDriver#getTitle()
	 */
	public String getTitle();

	/**
	 * @see WebDriver#getCurrentUrl()
	 */
	public String getCurrentUrl();
	
	/**
	 * @see WebDriver#getPageSource()
	 */
	public String getPageSource();
	
}

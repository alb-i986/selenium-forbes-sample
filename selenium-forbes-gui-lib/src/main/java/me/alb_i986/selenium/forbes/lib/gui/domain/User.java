package me.alb_i986.selenium.forbes.lib.gui.domain;

import me.alb_i986.selenium.forbes.lib.gui.pages.HomePage;

/**
 * A User has a Browser.
 * 
 * @author alb
 *
 */
public class User {

	private Browser browser;
	private String email = "";

	
	public User() {
		this.browser = new Browser();
	}
	
	public User(String email) {
		this();
		this.email = email;
	}


	/**
	 * Open the browser and browse to the homepge.
	 * @return {@link HomePage}
	 * 
	 * @see Browser#open()
	 * @see Browser#startSession()
	 */
	public HomePage openBrowser() {
		browser.open();
		return browser.startSession();
	}
	
	public void closeBrowser() {
		browser.close();
	}
	

	public String getEmail() {
		return email;
	}
}

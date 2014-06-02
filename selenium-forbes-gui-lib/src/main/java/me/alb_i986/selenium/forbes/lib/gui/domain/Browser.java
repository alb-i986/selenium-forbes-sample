package me.alb_i986.selenium.forbes.lib.gui.domain;

import me.alb_i986.selenium.forbes.lib.gui.WebDriverFactory;
import me.alb_i986.selenium.forbes.lib.gui.pages.HomePage;
import me.alb_i986.selenium.forbes.lib.gui.pages.PageBase;
import me.alb_i986.selenium.forbes.lib.gui.pages.WelcomePage;

import org.openqa.selenium.WebDriver;

/**
 * A Browser has a WebDriver.
 * 
 * A Browser may be opened and closed.
 * By opening a Browser, a WebDriver is instantiated.
 * 
 * @author alb
 *
 */
public class Browser {
	
	private WebDriver driver;

	public Browser() {
	}

	/**
	 * Create an instance of WebDriver.
	 * 
	 * @see WebDriverFactory#getWebDriver()
	 */
	public void open() {
		if(driver != null)
			throw new IllegalStateException("Browser already open: close it first");
		driver = WebDriverFactory.getWebDriver();
	}
	
	/**
	 * @see WebDriver#quit()
	 */
	public void close() {
		if(driver != null)
			driver.quit();
	}
	
	/**
	 * Start a session by browsing to the homepage.
	 * @return {@link HomePage}
	 */
	public HomePage startSession() {
		driver.get(PageBase.BASE_URL);
		WelcomePage welcomePage = new WelcomePage(driver, null);
		welcomePage.clickContinue();
		return new HomePage(driver, welcomePage);
	}

}

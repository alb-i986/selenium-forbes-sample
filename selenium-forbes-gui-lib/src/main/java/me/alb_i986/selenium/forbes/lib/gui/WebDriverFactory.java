package me.alb_i986.selenium.forbes.lib.gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

	/**
	 * Create and return a WebDriver instance of the given type.
	 * 
	 * @param browserType the supported browser to be created
	 * @throws IllegalArgumentException if the browser specified is not supported
	 */
	public static WebDriver getWebDriver(SupportedBrowser browserType) {
		switch (browserType) {
			case CHROME:
				return new ChromeDriver();
			case FIREFOX:
				return new FirefoxDriver();
			case SAFARI:
				return new SafariDriver();
			default:
				throw new IllegalArgumentException("The specified Browser type (" + browserType + ")"
							+ " is not supported at the moment");
		}
	}

}

package me.alb_i986.selenium.forbes.lib.gui;

import java.util.concurrent.TimeUnit;

import me.alb_i986.selenium.forbes.lib.gui.domain.SupportedBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

	public static final int IMPLICIT_WAIT_SECONDS = 10;
	
	public static SupportedBrowser BROWSER_TYPE = SupportedBrowser.CHROME;

	/**
	 * Create and return a WebDriver instance of the given type.
	 * Also, set an implicit wait of {@value WebDriverFactory#IMPLICIT_WAIT_SECONDS}s.
	 * 
	 * @param browserType the supported browser to be created
	 * @throws IllegalArgumentException if the browser specified is not supported
	 */
	public static WebDriver getWebDriver(SupportedBrowser browserType) {
		WebDriver driver;
		switch (browserType) {
			case CHROME:
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case SAFARI:
				driver = new SafariDriver();
				break;
			default:
				throw new IllegalArgumentException("The specified Browser type (" + browserType + ")"
							+ " is not supported at the moment");
		}
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_SECONDS, TimeUnit.SECONDS);
		return driver;
	}

	/**
	 * @return a {@link WebDriver} according to {@link #BROWSER_TYPE}
	 * 
	 * @see #getWebDriver(SupportedBrowser)
	 */
	public static WebDriver getWebDriver() {
		return getWebDriver(BROWSER_TYPE);
	}

}

package me.alb_i986.selenium.forbes.lib.gui.pages;

import org.openqa.selenium.WebDriver;

import me.alb_i986.selenium.tinafw.pages.Page;
import me.alb_i986.selenium.tinafw.pages.WebDriverFactory;
import me.alb_i986.selenium.tinafw.pages.WebDriverFactoryDecorator;

/**
 * Every time that a new browser interaction with forbes.com
 * is started, a welcome page is displayed, which prevents
 * the normal navigation.
 * This decorator solves the problem of transparently handling
 * the {@link WelcomePage}.
 * What it does is:
 * <ul>
 * <li>load the home page, which will actually bring up the {@link WelcomePage}</li>
 * <li>click on the link "continue to the site"</li>
 * </ul>
 */
public class WebDriverFactoryDecoratorForbes extends WebDriverFactoryDecorator {

	public WebDriverFactoryDecoratorForbes(WebDriverFactory decoratingFactory) {
		super(decoratingFactory);
	}

	@Override
	public WebDriver getWebDriver() {
		WebDriver driver = super.getWebDriver();
		driver.get(Page.BASE_URL);
		WelcomePage welcomePage = new WelcomePage(driver, null);
		welcomePage.clickContinue();
		return driver;
	}

}

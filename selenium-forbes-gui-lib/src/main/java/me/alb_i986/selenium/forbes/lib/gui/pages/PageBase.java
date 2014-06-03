package me.alb_i986.selenium.forbes.lib.gui.pages;

import java.util.List;

import me.alb_i986.selenium.forbes.lib.gui.pages.components.TopNavBar;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public abstract class PageBase
		extends LoadableComponent<PageBase> implements Page {
	
	public static String BASE_URL = "http://www.forbes.com";
	
	protected static final Logger logger = Logger.getLogger(Page.class);

	protected WebDriver driver;
	protected Page previousPage;

	private TopNavBar topNavBar;
	
	
	public PageBase(WebDriver driver, Page previous) {
		this.driver = driver;
		this.previousPage = previous;
		PageFactory.initElements(driver, this);
		topNavBar = new TopNavBar(driver, this);
	}
		
	
	/**
	 * @see WebDriver.Navigation#back()
	 */
	public Page gotoBack() {
		if(previousPage == null)
			throw new IllegalStateException("can't go back: no previous page exists");
		driver.navigate().back();
		return previousPage;
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

	/**
	 * @see WebDriver#getTitle()
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	/**
	 * @see WebDriver#getPageSource()
	 */
	public String getPageSource() {
		return driver.getPageSource();
	}

	/**
	 * @see WebDriver#getCurrentUrl()
	 */
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * @param locator
	 * @return {@link WebElement}
	 * 
	 * @see WebDriver#findElement(By)
	 */
	protected WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * @param locator
	 * @return list of {@link WebElement}
	 * 
	 * @see WebDriver#findElements(By)
	 */
	protected List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	@Override
	protected void load() {
		driver.get(BASE_URL);
		List<WebElement> continueLinks = getElements(By.cssSelector("a.continue"));
		if(!continueLinks.isEmpty()) {
			WebElement continueLink = continueLinks.get(0);
			if(continueLink.isDisplayed())
				continueLink.click();
		}
	}
}

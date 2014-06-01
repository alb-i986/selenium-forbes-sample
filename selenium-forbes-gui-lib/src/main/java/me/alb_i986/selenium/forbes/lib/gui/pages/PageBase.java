package me.alb_i986.selenium.forbes.lib.gui.pages;

import java.util.List;

import me.alb_i986.selenium.forbes.lib.gui.pages.components.TopMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

public abstract class PageBase
		extends LoadableComponent<PageBase> implements Page {
	
	public static final String BASE_URL = "http://www.forbes.com";

	protected WebDriver driver;
	protected Page previousPage;

	private TopMenu topMenu = new TopMenu(driver, this);
	
	
	public PageBase(WebDriver driver, Page previous) {
		this.driver = driver;
		this.previousPage = previous;
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getPageSource() {
		return driver.getPageSource();
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

	public HomePage gotoHome() {
		return topMenu.gotoHome();
	}
	

	public TopMenu getTopMenu() {
		return topMenu ;
	}

	
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
		List<WebElement> continueLinks = getElements(By.cssSelector("a.continue"));
		if(!continueLinks.isEmpty()) {
			WebElement continueLink = continueLinks.get(0);
			if(continueLink.isDisplayed())
				continueLink.click();
		}
	}
}

package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import me.alb_i986.selenium.forbes.lib.gui.pages.*;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

/**
 * A fine-grained page object, responsible for
 * dealing with a specific sub-tree of the DOM.
 *
 * <p>
 * Typically, a {@link PageComponent} is visible only to a {@link Page}.
 * This means that it should not return page objects: only page objects
 * should return other page objects.
 * Exception: {@link ExposedPageComponent}.
 * 
 * @author alb
 *
 */
public abstract class PageComponent {

	protected static final Logger logger = Logger.getLogger(PageComponent.class);
	
	protected WebDriver driver;

	public PageComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public abstract By getRootLocator();
	
}

package me.alb_i986.selenium.forbes.lib.gui.pages.components;


import me.alb_i986.selenium.tinafw.pages.Page;

import org.openqa.selenium.WebDriver;

/**
 * A {@link PageComponent} that is accessible by page objects' clients.
 * 
 * @author alb
 *
 */
public abstract class ExposedPageComponent extends PageComponent {

	protected Page currentPage;
	
	public ExposedPageComponent(WebDriver driver, Page currentPage) {
		super(driver);
		this.currentPage = currentPage;
	}
}

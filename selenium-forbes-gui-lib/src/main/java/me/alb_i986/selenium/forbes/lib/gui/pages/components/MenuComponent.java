package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import me.alb_i986.selenium.forbes.lib.gui.pages.Page;

import org.openqa.selenium.WebDriver;

public class MenuComponent extends PageComponent {

	protected Page current;
	
	public MenuComponent(WebDriver driver, Page current) {
		super(driver);
		this.current = current;
	}

	
}

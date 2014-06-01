package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageComponent {

	protected WebDriver driver;

	public PageComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}

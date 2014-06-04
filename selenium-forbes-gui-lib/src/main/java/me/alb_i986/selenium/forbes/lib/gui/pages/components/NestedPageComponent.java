package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import org.openqa.selenium.*;

public class NestedPageComponent {
	
	protected WebElement root;

	public NestedPageComponent(WebElement root) {
		this.root = root;
	}

	protected WebElement getElement(By locator) {
		return root.findElement(locator);
	}


}

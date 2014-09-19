package me.alb_i986.selenium.forbes.lib.gui.domain;

import me.alb_i986.selenium.forbes.lib.gui.pages.WebDriverFactoryDecoratorForbes;
import me.alb_i986.selenium.tinafw.domain.Browser;
import me.alb_i986.selenium.tinafw.pages.WebDriverFactory;
import me.alb_i986.selenium.tinafw.pages.WebDriverFactoryDecoratorImplicitWait;
import me.alb_i986.selenium.tinafw.pages.WebDriverFactoryLocal;

public class ForbesBrowser extends Browser {

	public ForbesBrowser() {
		this(
			new WebDriverFactoryDecoratorForbes(
				new WebDriverFactoryDecoratorImplicitWait(
						new WebDriverFactoryLocal()
				)
			)
		);
	}

	public ForbesBrowser(WebDriverFactory driverFactory) {
		super(driverFactory);
	}

}

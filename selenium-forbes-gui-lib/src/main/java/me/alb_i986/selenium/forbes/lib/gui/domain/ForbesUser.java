package me.alb_i986.selenium.forbes.lib.gui.domain;

import me.alb_i986.selenium.tinafw.domain.*;

/**
 * A User having a {@link ForbesBrowser}.
 */
public class ForbesUser extends User {

	/**
	 * Set a {@link ForbesBrowser} as browser.
	 */
	public ForbesUser() {
		this(new ForbesBrowser());
	}

	public ForbesUser(Browser browser) {
		super(browser);
	}
	

}

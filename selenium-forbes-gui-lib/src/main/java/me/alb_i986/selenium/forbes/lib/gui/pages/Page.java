package me.alb_i986.selenium.forbes.lib.gui.pages;


public interface Page {
	
	public Page gotoBack();
	public Page gotoHome();

	public String getTitle();
	public String getCurrentUrl();
	public String getPageSource();
	
}

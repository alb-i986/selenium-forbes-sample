package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import me.alb_i986.selenium.forbes.lib.gui.pages.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class TopNavBar extends ExposedPageComponent {

	private static final String ROOT_CSS_SELECTOR = "header nav ";

	@FindBy(css = ROOT_CSS_SELECTOR + " ul.main li.home")
	private WebElement homeLink;
	
	@FindBy(css = ROOT_CSS_SELECTOR + " ul.main a[data-ga-event*=realtime]")
	private WebElement realtimeLink;

	@FindBy(css = ROOT_CSS_SELECTOR + " ul.main a[data-ga-event*=popular]")
	private WebElement popularLink;

	@FindBy(css = ROOT_CSS_SELECTOR + " ul.main a[data-ga-event*=lists]")
	private WebElement listsLink;

	@FindBy(css = ROOT_CSS_SELECTOR + " ul.main a[data-ga-event*=video]")
	private WebElement videoLink;

	@FindBy(css = ROOT_CSS_SELECTOR + " div.search_bar input.search_input")
	private WebElement searchTextField;

	@FindBy(css = ROOT_CSS_SELECTOR + " div.search_bar input.form_submit")
	private WebElement searchSubmitBtn;
	
	@FindBy(css = ROOT_CSS_SELECTOR + " a.account")
	private WebElement loginLink;


	public TopNavBar(WebDriver driver, Page current) {
		super(driver, current);
	}

	
	public HomePage gotoHome() {
		homeLink.click();
		return new HomePage(driver, currentPage);
	}
	
	public RealTimePage gotoRealTime() {
		realtimeLink.click(); 
		return new RealTimePage(driver, currentPage);
	}

	public PopularPage gotoMostPopular() {
		popularLink.click(); 
		return new PopularPage(driver, currentPage);
	}
	
	public ListsPage gotoLists() {
		listsLink.click(); 
		return new ListsPage(driver, currentPage);
	}
	
	public VideoPage gotoVideo() {
		videoLink.click(); 
		return new VideoPage(driver, currentPage);
	}
	
	public LoginPage gotoLogin() {
		loginLink.click(); 
		return new LoginPage(driver, currentPage);
	}
	
	public SearchResultsPage doSearch(String text) {
		searchTextField.sendKeys(text);
		searchSubmitBtn.click();
		return new SearchResultsPage(driver, currentPage);
	}

	@Override
	public By getRootLocator() {
		return By.cssSelector(ROOT_CSS_SELECTOR);
	}
}

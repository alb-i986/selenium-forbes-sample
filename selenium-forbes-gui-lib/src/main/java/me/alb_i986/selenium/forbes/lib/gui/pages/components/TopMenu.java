package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import me.alb_i986.selenium.forbes.lib.gui.pages.HomePage;
import me.alb_i986.selenium.forbes.lib.gui.pages.MostPopularPage;
import me.alb_i986.selenium.forbes.lib.gui.pages.Page;
import me.alb_i986.selenium.forbes.lib.gui.pages.RealTimePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class TopMenu extends MenuComponent {

	private static final String ROOT_CSS_SELECTOR = "header nav ul.main ";

	@FindBys({
		@FindBy(css = ROOT_CSS_SELECTOR),
		@FindBy(partialLinkText = "New Posts"),
	})
	private WebElement newPostsLink;

	@FindBys({
		@FindBy(css = ROOT_CSS_SELECTOR),
		@FindBy(partialLinkText = "Most Popular"),
	})
	private WebElement mostPopularLink;


	@FindBy(css = ROOT_CSS_SELECTOR + " li.home")
	private WebElement homeLink;
	
	
	public TopMenu(WebDriver driver, Page current) {
		super(driver, current);
	}

	
	public RealTimePage gotoNewPosts() {
		newPostsLink.click(); 
		return new RealTimePage(driver, current);
	}
	
	public MostPopularPage gotoMostPopular() {
		mostPopularLink.click(); 
		return new MostPopularPage(driver, current);
	}
	
	public HomePage gotoHome() {
		homeLink.click();
		return new HomePage(driver, current);
	}

	
	public By getRootLocator() {
		return By.cssSelector(ROOT_CSS_SELECTOR);
	}

}

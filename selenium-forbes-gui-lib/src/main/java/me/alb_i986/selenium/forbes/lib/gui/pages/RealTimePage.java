package me.alb_i986.selenium.forbes.lib.gui.pages;

import me.alb_i986.selenium.forbes.lib.gui.pages.components.*;
import me.alb_i986.selenium.tinafw.pages.Page;
import me.alb_i986.selenium.tinafw.pages.PageHelper;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RealTimePage extends PageBase {
	
	public static final String URL = BASE_URL + "/real-time/";
	public static final String PARTIAL_EXPECTED_TITLE = "Real Time";
	
	
	public static RealTimePage get(WebDriver driver) {
		driver.get(URL);
		return new RealTimePage(driver, null);
	}

	
	private RealTimeStream stream = new RealTimeStream(driver);
	private StreamChannelNav channelNav = new StreamChannelNav(driver);


	public RealTimePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}
	

	public RealTimePage doSelectChannel(String channel) {
		channelNav.selectChannel(channel);
		return this;
	}
	
	public ArticlePage gotoArticle(String articleTitle) {
		stream
			.getEntry(articleTitle)
			.clickLinkToArticle();
		return new ArticlePage(driver, this);
	}
	
	@Override
	protected void waitUntilIsLoaded() {
		PageHelper.waitUntil(ExpectedConditions.titleContains(PARTIAL_EXPECTED_TITLE), driver);
	}


	public class StreamChannelNav extends PageComponent {
		
		public static final String ROOT_CSS_SELECTOR = "section.stream ul.channel_nav ";

		public StreamChannelNav(WebDriver driver) {
			super(driver);
		}
		
		public void selectChannel(String channel) {
			WebElement channelEl = driver.findElement(
				By.cssSelector(
					ROOT_CSS_SELECTOR + "li[data-stream-id=" + channel.toLowerCase() + "]"
				)
			);
			channelEl.click();
		}

		@Override
		public By getRootLocator() {
			return By.cssSelector(ROOT_CSS_SELECTOR);
		}
	}

}

package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 * The list of articles in the stream.
 * 
 * @author alb
 *
 */
public class RealTimeStream extends PageComponent {
	
	public static final String ROOT_CSS_SELECTOR = "ul.stream_content ";
	
	@FindBy(css = "li.stream_item:not(.is_hidden_update)")
	List<WebElement> visibleArticles;

	public RealTimeStream(WebDriver driver) {
		super(driver);
	}
	
	public StreamEntry getEntry(String expectedTitle) {
		StreamEntry foundEntry = null;
		for (WebElement article : visibleArticles) {
			StreamEntry entry = new StreamEntry(article);
			if(entry.isDisplayed() && entry.hasTitle(expectedTitle)) {
				foundEntry = entry;
				break;
			}
		}
		return foundEntry;
	}

	public StreamEntry getEntry(int index) {
		WebElement entry = visibleArticles.get(index);
		if(!entry.isDisplayed())
			return null;
		return new StreamEntry(entry);
	}

	
	public class StreamEntry extends NestedPageComponent {
		
		private By titleLocator = By.cssSelector("article h2 a");

		public StreamEntry(WebElement root) {
			super(root);
		}

		public void clickLinkToArticle() {
			getElement(titleLocator).click();
		}

		public String getTitle() {
			return getElement(titleLocator).getText();
		}
		
		public boolean hasTitle(String expectedTitle) {
			return getTitle().equals(expectedTitle);
		}
	}
	
	@Override
	public By getRootLocator() {
		return By.cssSelector(ROOT_CSS_SELECTOR);
	}

}
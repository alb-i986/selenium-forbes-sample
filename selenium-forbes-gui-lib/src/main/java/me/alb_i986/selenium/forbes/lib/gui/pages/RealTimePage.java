package me.alb_i986.selenium.forbes.lib.gui.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RealTimePage extends PageBase {
	
	public static final String URL = BASE_URL + "/real-time/";
	public static final String PARTIAL_EXPECTED_TITLE = "Real Time";


	public RealTimePage(WebDriver driver, Page previous) {
		super(driver, previous);
	}
	

	public static RealTimePage get(WebDriver driver) {
		driver.get(URL);
		return new RealTimePage(driver, null);
	}


	public ArticlePage viewArticle(String articleTitle) {
		driver.findElement(By.linkText(articleTitle)).click();		
		return new ArticlePage(driver, this);
	}
	
	public String getRandomArticleTitle() {
		List<WebElement> articleElements = driver.findElements(By.cssSelector("article h2 a"));
		String randomTitle = articleElements.get(new Random().nextInt(articleElements.size())).getText();
		return randomTitle;
	}

	@Override
	protected void waitUntilIsLoaded() {
		PageHelper.ExplicitlyWait.until(ExpectedConditions.titleContains(PARTIAL_EXPECTED_TITLE), driver);
	}
}

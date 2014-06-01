package me.alb_i986.selenium.forbes.lib.gui.pages;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RealTimePage extends PageBase {
	
	private static final String url = BASE_URL + "/real-time/";


	public RealTimePage(WebDriver driver, Page previous) {
		super(driver, previous);
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
	protected void load() {
		driver.get(url);
		super.load();
	}


	@Override
	protected void isLoaded() throws Error {
		Assert.assertTrue(driver.getTitle().contains("Real Time"));
	}
}

package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import static org.junit.Assert.*;
import me.alb_i986.selenium.forbes.lib.gui.SupportedBrowser;
import me.alb_i986.selenium.forbes.lib.gui.WebDriverFactory;
import me.alb_i986.selenium.forbes.lib.gui.pages.HomePage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class TopMenuTest {

	private static SupportedBrowser browserType = SupportedBrowser.CHROME;
	
	private TopMenu componentUnderTest;
	private WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		driver = WebDriverFactory.getWebDriver(browserType);
		HomePage homePage = new HomePage(driver, null);
		homePage.get();
		componentUnderTest = homePage.getTopMenu();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void gotoNewPosts() {
		componentUnderTest.gotoNewPosts();
	}

	@Test
	public void gotoMostPopular() {
		componentUnderTest.gotoMostPopular();
	}
	
	@Test
	public void gotoHome() {
		componentUnderTest.gotoHome();
	}
}

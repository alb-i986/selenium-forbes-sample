package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import me.alb_i986.selenium.forbes.lib.gui.domain.ForbesUser;
import me.alb_i986.selenium.forbes.lib.gui.pages.RealTimePage;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class RealTimePageTest extends PageTestBase {

	private ForbesUser user;
	private RealTimePage pageUnderTest;

	
	public RealTimePageTest() {
		user = new ForbesUser();
	}


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		user.openBrowser();
		WebDriver driver = user.getBrowser().getWebDriver();
		pageUnderTest = RealTimePage.get(driver);
	}

	@After
	public void tearDown() throws Exception {
		user.closeBrowser();
	}


	@Test
	public void gotoArticle() {
		pageUnderTest.gotoArticle(5);
	}
/*
	@Test
	public void doSelectChannel() {
		String channel = "";
		pageUnderTest.doSelectChannel(channel);
	}
*/
}

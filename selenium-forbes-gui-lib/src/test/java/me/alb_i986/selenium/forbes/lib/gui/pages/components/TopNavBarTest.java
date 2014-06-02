package me.alb_i986.selenium.forbes.lib.gui.pages.components;

import me.alb_i986.selenium.forbes.lib.gui.domain.User;
import me.alb_i986.selenium.forbes.lib.gui.pages.HomePage;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TopNavBarTest extends PageTestBase {
	
	private User user;
	private TopNavBar componentUnderTest;

	
	public TopNavBarTest() {
		user = new User();
	}


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		HomePage homePage = user.openBrowser();
		componentUnderTest = homePage.getTopMenu();
	}

	@After
	public void tearDown() throws Exception {
		user.closeBrowser();
	}

	
	@Test
	public void gotoHome() {
		componentUnderTest.gotoHome();
	}

	@Test
	public void gotoNewPosts() {
		componentUnderTest.gotoRealTime();
	}

	@Test
	public void gotoMostPopular() {
		componentUnderTest.gotoMostPopular();
	}

	@Test
	public void gotoLists() {
		componentUnderTest.gotoLists();
	}
	
	@Test
	public void gotoVideo() {
		componentUnderTest.gotoVideo();
	}

	@Test
	public void gotoLogin() {
		componentUnderTest.gotoLogin();
	}
	
	@Test
	public void doSearch() {
		String text = "text";
		componentUnderTest.doSearch(text);
	}
}

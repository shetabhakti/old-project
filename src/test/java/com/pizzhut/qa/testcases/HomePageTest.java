package com.pizzhut.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.HutRewardPage;
import com.pizzahut.qa.pages.JoinPage;
import com.pizzhut.qa.base.TestBase;

public class HomePageTest extends TestBase {

	HomePage homePage;
	DealPage dealPage;
	JoinPage joinPage;
	HutRewardPage hutrewardPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

		homePage = new HomePage();
		dealPage = new DealPage();
		joinPage = new JoinPage();
		hutrewardPage = new HutRewardPage();

	}

	@Test

	public void dealsLinkTest() {
		dealPage = homePage.clickOnDealsLinks();
		// Assert.assertTrue(b);
	}

	@Test
	public void joinLinkTest() {
		joinPage = homePage.clickJoinLink();
	}

	@Test
	public void rewardLinkTest() {
		hutrewardPage = homePage.clickOnRewardLink();
	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}

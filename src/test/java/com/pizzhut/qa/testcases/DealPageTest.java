package com.pizzhut.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.HutRewardPage;
import com.pizzahut.qa.pages.JoinPage;
import com.pizzhut.qa.base.TestBase;

public class DealPageTest extends TestBase {
	HomePage homePage;
	DealPage dealPage;
	JoinPage joinPage;
	HutRewardPage hutrewardPage;

	public DealPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

		dealPage = new DealPage();
		joinPage = new JoinPage();
		hutrewardPage = new HutRewardPage();

	}

	@Test
	public void facebookIconTest() {
		dealPage.verifyFBIcon();

	}

	@Test
	public void twitterIconTest() {
		boolean twit = dealPage.verifyTwitterIcon();
		Assert.assertEquals(twit, true, "twitter icon is not visible");
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}

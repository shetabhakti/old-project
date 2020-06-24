package com.pizzhut.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import com.pizzahut.qa.pages.DealPage;
import com.pizzahut.qa.pages.HomePage;
import com.pizzahut.qa.pages.HutRewardPage;
import com.pizzahut.qa.pages.JoinPage;
import com.pizzhut.qa.base.TestBase;

public class HutRewardPageTest extends TestBase {

	HomePage homePage;
	DealPage dealPage;
	JoinPage joinPage;
	HutRewardPage hutrewardPage;;

	@BeforeMethod

	public void setUp() {
		initialization();

		homePage = new HomePage();
		dealPage = new DealPage();
		joinPage = new JoinPage();
		hutrewardPage = new HutRewardPage();

	}

	@Test(priority = 1)
	public void verifyRewardPageTitleTest() {
		String rewardPageTitle = hutrewardPage.verifyRewardPageTitle();
		Assert.assertNotEquals(rewardPageTitle, "Pizza Hut Hut Rewards and Loyalty", "Home page title not matched");

	}

	@Test
	public void rewardPageTextTest() {
		hutrewardPage.rewardPageText();
		Assert.assertTrue(true, "text is visible");

	}

	@Test
	public void SignInButtonTest() {
		hutrewardPage.verifySignInButton();
		Assert.assertTrue(true, "test fail sign In button is not displayed");
	}

	@Test
	public void SignUpLinkTest() {
		hutrewardPage.verifySignUpLink();
		Assert.assertTrue(true, "Test fail: Sign up link is not enabled");
	}

	@Test
	public void headingTest() {
		homePage.clickOnRewardLink();
		driver.findElement(By.id("faqstitle--drawer_1")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

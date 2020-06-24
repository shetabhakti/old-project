package com.pizzhut.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.pizzahut.qa.pages.LoginPage;
import com.pizzhut.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {

		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Pizza Hut: Pizza Delivery | Pizza Carryout | Coupons | Wings & More");
	}

	@Test
	public void pizzahutLogoImageTest() {
		boolean image = loginpage.validatePizzahutLogoImage();
		Assert.assertTrue(image);
	}

	@Test(priority = 2)
	public void loginTest() {
		driver.findElement(By.id("ph-sign-in")).click();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}

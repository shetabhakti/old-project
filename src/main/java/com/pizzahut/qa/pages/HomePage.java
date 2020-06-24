package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(id= "lg-nav-menu")
	WebElement menuButton;
	
	
	@FindBy(id= "lg-nav-deals")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[text()='join']")
	WebElement joinLink;
	
	@FindBy(xpath="//a[@id='ph-hutrewards-link']")
	WebElement hutRewardLink;
	
	

	//Initializing the page object
	
	public HomePage() {
		PageFactory.initElements(driver, this); //we can also write this to refer current class object
		}
	
	//no void as it will return new dealpage
	public DealPage clickOnDealsLinks() {
		dealsLink.click();
		return new DealPage();
	}
	
	public JoinPage clickJoinLink() {
		joinLink.click();
		return new JoinPage();
	}
	
	public HutRewardPage clickOnRewardLink() {
		hutRewardLink.click();
		return new HutRewardPage();
	}
}

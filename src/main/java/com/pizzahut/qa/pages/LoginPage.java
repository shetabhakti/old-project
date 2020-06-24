package com.pizzahut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pizzhut.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:object repository
		@FindBy(name="email")
		WebElement userName;
		
		@FindBy(name="password")
		WebElement password;
		
		
		
		@FindBy(xpath="//button[contains(text(),'join')]")
		WebElement joinBtn;
		
		@FindBy(xpath ="//a[@id='ph-logo-small']//img[@class='img-responsive center-block ph-image-wrap']")
		WebElement pizzahutLogo;
		
	
		//how to initialize the Pagefactory? = by using mathod of initelements and passing the driver and current class obj
		public LoginPage() {
			PageFactory.initElements(driver, this);//instead of this we can write LoginPage.class as well...here this is pointing to current class
		}

		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validatePizzahutLogoImage() {
			return pizzahutLogo.isDisplayed();
		}
		
		public void login(String un, String pwd) {
			userName.sendKeys(un);
			password.sendKeys(pwd);
			//loginBtn.click();
		}
		
}

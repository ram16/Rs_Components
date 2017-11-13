package com.cucumber.framework.rs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.rs.TestBase.TestBase;

public class BasketSummaryPage extends TestBase {

	WebDriver driver;

	@FindBy(xpath = "//button[contains(@id,'atbBtn-1')]")
	
	WebElement Add;
	
	@FindBy(css = "i.icon-cart")
	@CacheLookup
	WebElement Basket;
	
	@FindBy(xpath = ".//*[@id='checkoutSecurelyAndPuchBtn']")
	 @CacheLookup
	WebElement Checkout;

	public BasketSummaryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	public void checkOut() 
	{
		
		waitForClickability(Checkout);
		
		Checkout.click();
}
	
	public void ADD()  {

    
	isElementPresent(Add);
			waitForClickability(Add);
			Add.click();
		
}
	
	public void clickOnBasket() {

		
		waitForClickability(Basket);
		Basket.click();

}
}
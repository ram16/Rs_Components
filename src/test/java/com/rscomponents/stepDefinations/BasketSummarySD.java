package com.rscomponents.stepDefinations;

import com.cucumber.framework.helper.rs.TestBase.TestBase;
import com.cucumber.framework.rs.Pages.BasketSummaryPage;
import cucumber.api.java.en.Then;

public class BasketSummarySD extends TestBase {

	
	BasketSummaryPage basketSummaryPage = new BasketSummaryPage(driver);
	
	
	
	
	
	
	
	
	
	
	@Then("^should click Add button$")
	public void should_click_Add_button() throws Throwable {
		
		

		basketSummaryPage.ADD();
	
	
	
	}
	
	
	
	
	
	
	@Then("^\"([^\"]*)\" should added in basket summary$")
	public void should_added_in_basket_summary(String item) throws Throwable {
		
		basketSummaryPage.clickOnBasket();
		

}

	@Then("^should click on Checkout$")
	public void should_click_on_Checkout() throws Throwable {
		
		basketSummaryPage.checkOut();

}
	
}

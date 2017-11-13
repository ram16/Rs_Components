package com.rscomponents.stepDefinations;

import com.cucumber.framework.helper.rs.TestBase.TestBase;
import com.cucumber.framework.rs.Pages.HomePage;
import com.cucumber.framework.rs.Pages.LoginPage;
import com.cucumber.framework.rs.Pages.ProductDetailsPage;

import cucumber.api.java.en.Then;

public class ProductDetailsSD extends TestBase {

	HomePage homepage = new HomePage(driver);
	LoginPage loginpage = new LoginPage(driver);
	ProductDetailsPage productdetialspage = new ProductDetailsPage(driver);

	@Then("^user should login to appplication with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_login_to_appplication_with_and(String username, String password) throws Throwable {

		loginpage.loginToApplication("testing123!", "testing321");
		

	}

	@Then("^should select any Menu \"([^\"]*)\" and click$")
	public void should_select_any_Menu_and_click(String options) throws Throwable {
		homepage.selectMenuOptions("All Products");
	}

	@Then("^should select categories \"([^\"]*)\" displayed$")
	public void should_select_categories_displayed(String categories) throws Throwable {
		homepage.SelectCategories(categories);
		
	}

	@Then("^should select SubCategories \"([^\"]*)\" displayed$")
	public void should_select_SubCategories_displayed(String SubCategories) throws Throwable {
		productdetialspage.selectSubCategories(SubCategories);
		
	}

	@Then("^should select \"([^\"]*)\" added to basket$")
	public void should_select_added_to_basket(String SubCategories1) throws Throwable {
		productdetialspage.selectSubCategories1(SubCategories1);
		
	}
/*	
	@Then("^should click Add button$")
	public void should_click_Add_button() throws Throwable {
		
		
		productdetialspage.ADD();
		
		

	}*/
	

	/*@Then("^\"([^\"]*)\" should added in basket summary$")
	public void should_added_in_basket_summary(String item) throws Throwable {
		
		productdetialspage.clickOnBasket();
		

}*/
}

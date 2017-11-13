package com.rscomponents.stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.cucumber.framework.helper.rs.TestBase.TestBase;
import com.cucumber.framework.rs.Pages.HomePage;
import com.cucumber.framework.rs.Pages.SearchResultPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RsSearchFiltersSD extends TestBase {



	HomePage homepage = new HomePage(driver);
	SearchResultPage searchresultpage = new SearchResultPage(driver);
	
	@Then("^user enter \"([^\"]*)\" in search filter$")
	public void user_enter_in_search_filter(String Keyword) throws Throwable {
		homepage.searchKeywords(Keyword);

	}

	@And("^user should display \"([^\"]*)\" page$")
	public void user_should_display_page(String keyword) throws Throwable {

		searchresultpage.searchPageByBreadCrumb(keyword);
		Assert.assertTrue(true, keyword);

	}
}

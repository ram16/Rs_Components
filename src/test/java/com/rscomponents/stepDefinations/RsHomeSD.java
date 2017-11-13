package com.rscomponents.stepDefinations;

import java.io.IOException;

import org.testng.Assert;
import com.cucumber.framework.helper.rs.TestBase.TestBase;
import com.cucumber.framework.rs.Pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RsHomeSD extends TestBase{

	 //static WebDriver driver =  TestBase.driver;
	
	  
	  
	HomePage homepage = new HomePage(driver);	
	
	
	@Given("^user is on Rs homepage$")
	public void user_is_on_Rs_homepage() throws Throwable {
		
			homepage.isHomeSectionDisplayed();
	
			}
	 
	@When("^user clicks on Homepage login button")
	public void user_clicks_on_Homepage_login_button() throws Throwable {
		
	
		    homepage.loginClick();
	
		
	
		
	}}
	


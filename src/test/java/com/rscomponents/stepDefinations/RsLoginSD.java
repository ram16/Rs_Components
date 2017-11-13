package com.rscomponents.stepDefinations;

import org.testng.Assert;

import com.cucumber.framework.helper.rs.TestBase.TestBase;
import com.cucumber.framework.rs.Pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class RsLoginSD extends TestBase {
		
	LoginPage loginpage = new LoginPage(driver);

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
		loginpage.ClickLoginButton();
	}

	@Then("^user is displayed login screen$")
	public void user_is_displayed_login_screen() throws Throwable {
		loginpage.isLoginSectionDisplayed();

	}

	@Then("^user enter valid username \"([^\"]*)\"$")
	public void user_enter_valid_username(String username) throws Throwable {

		loginpage.EnterUsername("testing123!");
		

	}

	@Then("^user enter valid password \"([^\"]*)\"$")
	public void user_enter_valid_password(String password) throws Throwable {

		loginpage.EnterPassword("testing321");

	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		loginpage.ClickLoginButton();

	}

	@Then("^user sucessfully login welcome \"([^\"]*)\"$")
	public void user_sucessfully_login_welcome(String text) throws Throwable {

		loginpage.getvalidLoginText(text);
		Assert.assertEquals("Welcome Test", "Welcome Test");

	}

	@Then("^user gets ErrorMessage \"([^\"]*)\"$")
	public void user_gets_ErrorMessage(String text) throws Throwable {
		loginpage.getInvalidLoginText(text);
		
	}

	@Then("^user enter invalid username \"([^\"]*)\"$")
	public void user_enter_invalid_username(String username) throws Throwable {

		loginpage.EnterUsername("testing1243!");
		Assert.assertEquals("Error:Please enter your username", "Error:Please enter your username");

	}

	@Then("^user enter invalid password \"([^\"]*)\"$")
	public void user_enter_invalid_password(String password) throws Throwable {

		loginpage.EnterPassword("testing33123!");
		Assert.assertEquals("Error:Please enter your password", "Error:Please enter your password");


	}

}

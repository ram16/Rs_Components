package com.cucumber.framework.rs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.rs.TestBase.TestBase;

public class LoginPage extends TestBase {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	 @CacheLookup
	WebElement UserName;

	@FindBy(xpath = "//input[@name='j_password']")
	 @CacheLookup
	WebElement Password;

	@FindBy(xpath = "//input[@name='loginBtn']")
	 @CacheLookup
	WebElement LoginBtn;

	@FindBy(xpath = "//input[@id='rememberMe']")
	 @CacheLookup
	WebElement Remember;

	@FindBy(css = ".welcome")
	 @CacheLookup
	WebElement Weclometext;

	@FindBy(xpath = ".//*[@id='pagecell']/div[2]/div[1]/form/div[2]/ul/li[2]")
	 @CacheLookup
	WebElement FieldErrorUsernameMessage;

	@FindBy(xpath = ".//*[@id='pagecell']/div[2]/div[1]/form/div[2]/ul/li[4]")
	WebElement FieldErrorPasswordMessage;

	@FindBy(xpath = ".//*[@id='pagecell']/div[2]/div[1]/form/h3")
	WebElement errorHeading;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void isLoginSectionDisplayed() {

	}

	public void EnterUsername(String username) throws InterruptedException {
		this.UserName.sendKeys(username);
	}

	public void EnterPassword(String password) throws InterruptedException {
		this.Password.sendKeys(password);
	}

	public HomePage ClickLoginButton() throws InterruptedException {
		LoginBtn.click();
		return new HomePage(driver);

	}

	public void getvalidLoginText(String text) {
		Weclometext.getCssValue(text);

	}

	public void getFieldPassword(String text) {
		FieldErrorPasswordMessage.getText();

	}

	public void getInvalidUserName(String text) {
		FieldErrorUsernameMessage.getAttribute(text);

	}

	public void getInvalidLoginText(String text) {
		errorHeading.getAttribute(text);

	}

	public void loginToApplication(String username, String password) throws InterruptedException {
		UserName.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();
	}

	public void clickOnProduct(String product) {
		String locator = "//a[contains(text(),'" + product + "')]";
		driver.findElement(By.xpath(locator)).click();
	}

}

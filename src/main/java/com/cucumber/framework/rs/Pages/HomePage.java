package com.cucumber.framework.rs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.rs.TestBase.TestBase;

public class HomePage extends TestBase {

	WebDriver driver;

	@FindBy(xpath = ".//*[@id='pageHeader']/div[2]/div[2]/div/a[1]")
	 @CacheLookup
	WebElement HomeLogIn;

	@FindBy(id = "searchTerm")
	 @CacheLookup
	WebElement SearchBar;
	 @CacheLookup
	@FindBy(id = "btnSearch")
	WebElement SearchButton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void isHomeSectionDisplayed() {
		(HomeLogIn).isDisplayed();

	}

	public void loginClick() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='pageHeader']/div[2]/div[2]/div/a[1]")).click();

	}

	public void selectMenuOptions(String product) {
		String locator = "//a[contains(text(),'" + product + "')]";
		driver.findElement(By.xpath(locator)).click();
	}

	public void SelectCategories(String Categories) {
		String locator = "//a[contains(text(),'" + Categories + "')]";
		driver.findElement(By.xpath(locator)).click();
	}

	public void searchKeywords(String product) {

		SearchBar.clear();
		SearchBar.sendKeys(product);
		SearchButton.click();

	}
}

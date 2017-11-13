package com.cucumber.framework.rs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.framework.helper.rs.TestBase.TestBase;

public class SearchResultPage extends TestBase {

	WebDriver driver;

	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchPageByBreadCrumb(String product) {
		String SearchKeyword = driver.findElement(By.xpath(".//*[@id='breadcrumb']")).getText();
		SearchKeyword.contains(product);
	

	}

	public void searchPageByUrl(String product) {

		driver.getCurrentUrl().contains(product);
		
	}
}
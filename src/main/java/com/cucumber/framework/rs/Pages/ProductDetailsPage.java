/**
 * @author RAMU
 *
 */
package com.cucumber.framework.rs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumber.framework.helper.rs.TestBase.TestBase;

public class ProductDetailsPage extends TestBase {

	WebDriver driver;

/*	@FindBy(css = "i.icon-cart")
	@CacheLookup
	WebElement Basket;*/

	@FindBy(id = "js-basketQty")
	@CacheLookup
	WebElement BasketQty;
	
	//@FindBy(xpath = "//button[contains(@id,'atbBtn-1')]")
	
	//WebElement Add;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectSubCategories(String subCategories) {
		List<WebElement> products = driver
				.findElements(By.xpath("//*[contains(@class,'rsGARealEstate')]//a[contains(text(),'" + subCategories + "')]"));

		for (WebElement element : products) {
			System.out.println(element.getText());
			try {
				if (subCategories.equals(element.getText()))
					element.click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void selectSubCategories1(String sf) {

		List<WebElement> products = driver
				.findElements(By.xpath("//*[contains(@class,'brcategories')]//a[contains(text(),'" + sf + "')]"));

		for (WebElement element : products) {
			System.out.println(element.getText());
			try {
				if (sf.equals(element.getText()))
					
					element.click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void AddItemToCart(String item ) {
		List<WebElement> products = driver
				.findElements(By.xpath("//*[contains(@class,'product-name')]//a[contains(text(),'" + item + "')]"));
		for (WebElement element : products) {
			System.out.println(element.getText());
			try {
				if (item.equals(element.getText()))
					waitForClickability(element);
					element.click();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

/*	public void clickOnBasket() {

		
		waitForClickability(Basket);
		Basket.click();

	}*/

/*public void ADD()  {

        
	isElementPresent(Add);
			waitForClickability(Add);
			Add.click();
		
}*/




	public void checkBasketQty() {
		BasketQty.hashCode();
	}
}

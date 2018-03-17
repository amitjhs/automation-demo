package com.simplepage.functionaltest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends ShopifyBasePage {
	
	@FindBy(xpath = "")
	private WebElement _local;

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public boolean isLoaded() {
		{
			if (driver.getTitle() == "Product Details")
				return true;
			else
				return false;
		}
	}

}
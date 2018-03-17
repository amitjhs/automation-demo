package com.shopify.functionaltest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	private WebDriver driver;
	
	@FindBy(xpath = "")
	private WebElement _local;

	// Default Constructor
	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
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
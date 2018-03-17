package com.shopify.functionaltest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

	private WebDriver driver;

	@FindBy(xpath = "")
	private WebElement _local;

	@FindBy(xpath = ".//div[@id='homepage-slider']//li")
	private List <WebElement> _homePageSliders;
	
	@FindBy(xpath = "//ul[@id='homefeatured']//li/div[@class='product-container']")
	private List <WebElement> _productContainers;

	// Default Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isLoaded() {
		{
			if (driver.getTitle() == "My Store")
				return true;
			else
				return false;
		}
	}

	public List <WebElement> getHomePageSliders()
	{
		return _homePageSliders;
	}
	
	public List <WebElement> getHomePageFeaturedProducts()
	{
		return _productContainers;
	}

	public HomePage selectFeaturedProductFromHomePage() {
		_productContainers.get(2).findElement(By.tagName("a")).click();
		return this;
	}
}

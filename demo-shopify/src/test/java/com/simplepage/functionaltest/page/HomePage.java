package com.simplepage.functionaltest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends ShopifyBasePage  {

	@FindBy(xpath = "")
	private WebElement _local;

	@FindBy(xpath = ".//div[@id='homepage-slider']//li")
	private List <WebElement> _homePageSliders;
	
	@FindBy(xpath = "//ul[@id='homefeatured']//li/div[@class='product-container']")
	private List <WebElement> _productContainers;


	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
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

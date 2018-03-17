package com.shopify.functionaltest.page;

import org.openqa.selenium.WebDriver;

public class BasePage{

	public String getTitle(WebDriver driver){
		return driver.getTitle();
	}

}

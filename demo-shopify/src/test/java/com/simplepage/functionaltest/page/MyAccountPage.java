package com.simplepage.functionaltest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends ShopifyBasePage {

	@FindBy(xpath = "")
	private WebElement _local;

	public MyAccountPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public MyAccountPage isLoaded() {
		return this;
	}

	public MyAccountPage clickOnLink(String linkText){
		driver.findElement(By.linkText(linkText)).click();
		return this;
	}
}

package com.simplepage.functionaltest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends BasePage {
	
	@FindBy(xpath = "")
	private WebElement _local;

	public FooterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
}

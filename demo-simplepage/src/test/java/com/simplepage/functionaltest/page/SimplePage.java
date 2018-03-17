package com.simplepage.functionaltest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SimplePage extends BasePage {

	public SimplePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


}

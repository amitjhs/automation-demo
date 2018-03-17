package com.simplepage.functionaltest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;
	}


    public BasePage clickOnLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
        return this;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}

package com.shopify.functionaltest.test;

import com.automationframework.functionaltest.BrowserFactory;
import com.automationframework.functionaltest.Prop;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;

	private BrowserFactory browser = new BrowserFactory();
    private Prop prop = new Prop();

    public String defaultURL = prop.get("BaseURL");

    @BeforeClass(alwaysRun = true)
	@Parameters("browser")
	public void LaunchApplication(@Optional("FireFox") String _browser) {
		if (driver != null) {
            return;
        }

		driver = browser.launchBrowser(_browser);
		driver.get(defaultURL);
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		browser.releaseWebDriver(driver);
	}
}
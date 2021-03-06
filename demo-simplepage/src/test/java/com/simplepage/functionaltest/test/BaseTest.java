package com.simplepage.functionaltest.test;

import com.automationframework.functionaltest.BrowserFactory;
import com.automationframework.functionaltest.Prop;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;

import static org.hamcrest.core.Is.is;

public class BaseTest {

	public WebDriver driver;

    private Prop prop = new Prop();

    public String defaultURL = prop.get("BaseURL");

    @BeforeClass(alwaysRun = true)
	@Parameters("browser")
	public void LaunchApplication(@Optional("FireFox") String browser) {
		if (driver != null) {
            return;
        }

		driver = new BrowserFactory().getDriver(browser);
		driver.get(defaultURL);
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		releaseWebDriver();
	}

	private void releaseWebDriver() {
		driver.quit();
		if (driver.toString().contains("InternetExplorerDriver")) {
			try {
				Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver = null;
	}

}
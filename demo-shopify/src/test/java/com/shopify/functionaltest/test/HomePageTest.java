package com.shopify.functionaltest.test;

import com.shopify.functionaltest.page.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.automationframework.functionaltest.MAssert.assertTrue;

public class HomePageTest extends BaseTest {

	private HomePage homePage;

	@BeforeMethod
	public void setup(){
		homePage = new HomePage(driver);
	}

	@Test
	public void GivenApplicationWhenUserRenderAppicationThenApplicationHomePageShouldRender() {
		assertTrue(homePage.isLoaded());
	}

	@Test
	public void GivenFeaturedProductsWhenUserLaunchHomePageFeaturedProductsShouldLauchOnHomePage() {
		assertTrue(homePage.getHomePageFeaturedProducts().size()>1);
	}

	@Test
	public void GivenMerchandisingZonesOnHomePageWhenUserLaunchHomePageHomePageMorethanOneSliderShouldLaunch() {
		assertTrue(homePage.getHomePageSliders().size()>1);
	}

}

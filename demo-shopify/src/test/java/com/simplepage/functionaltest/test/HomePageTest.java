package com.simplepage.functionaltest.test;

import com.simplepage.functionaltest.page.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.automationframework.functionaltest.MAssert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HomePageTest extends BaseTest {

	private HomePage homePage;

	@BeforeMethod
	public void setup(){
		homePage = new HomePage(driver);
	}

	@Test
	public void GivenApplicationWhenUserRenderAppicationThenApplicationHomePageShouldRender() {
		assertThat(homePage.getTitle(), is("My Store"));
	}

	@Test
	public void GivenFeaturedProductsWhenUserLaunchHomePageFeaturedProductsShouldLauchOnHomePage() {
		//assertThat(homePage.getHomePageFeaturedProducts().size(), greaterThan (1));
		assertTrue(homePage.getHomePageFeaturedProducts().size() > 1);
	}

	@Test
	public void GivenMerchandisingZonesOnHomePageWhenUserLaunchHomePageHomePageMorethanOneSliderShouldLaunch() {
		//assertThat(homePage.getHomePageSliders().size(), is(greaterThan (1)));
		assertTrue(homePage.getHomePageSliders().size() > 1);
	}

}

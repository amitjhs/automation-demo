package com.shopify.functionaltest.test;

import org.testng.annotations.Test;

import static com.automationframework.functionaltest.MAssert.assertAreEqual;


public class ProductDetailsPageTest extends BaseTest {
    String expectedTitle = "Metacube Software";

    @Test
    public void GivenProductsImagesOnHomePageWhenClickOnAnyProductImageThenProductDetailsPageShouldRender() {

        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, "B");

    }

    @Test
    public void GivenHomeIconOnBreadCrumWhenClickThenHomePageShouldRender() {

        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, "B");

    }

    @Test
    public void GivenAddToCartButtonWhenCLickForProductThenConfirmationMessageShouldDisplayOnOverLay() {
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, "B");
    }
}

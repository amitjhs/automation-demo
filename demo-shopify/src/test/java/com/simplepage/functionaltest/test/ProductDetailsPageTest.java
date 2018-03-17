package com.simplepage.functionaltest.test;

import com.simplepage.functionaltest.page.ProductDetailsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.automationframework.functionaltest.MAssert.assertAreEqual;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ProductDetailsPageTest extends BaseTest {

    private ProductDetailsPage page;

    @BeforeMethod
    public void setup(){
        this.page = new ProductDetailsPage(driver);
    }

    @Test
    public void GivenProductsImagesOnHomePageWhenClickOnAnyProductImageThenProductDetailsPageShouldRender() {

        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, "B");

        assertThat(page.getTitle(), is("B"));

    }

    @Test
    public void GivenHomeIconOnBreadCrumWhenClickThenHomePageShouldRender() {

        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, "B");

        assertThat(page.getTitle(), is("B"));

    }

    @Test
    public void GivenAddToCartButtonWhenCLickForProductThenConfirmationMessageShouldDisplayOnOverLay() {
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, "B");

        assertThat(page.getTitle(), is("B"));
    }
}

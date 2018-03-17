package com.shopify.functionaltest.test;

import org.testng.annotations.Test;

import static com.automationframework.functionaltest.MAssert.assertAreEqual;

public class MyAccountPageTest extends BaseTest {

    @Test
    public void GivenSignInLinkOnHomePageWhenUserClickOnSignInThenMyAccountPageShouldRender() {
        String expectedTitle = "Metacube Software";
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, expectedTitle);
    }

    @Test
    public void GivenEmailAddressTextBoxOnMyAccountWhenProvideInvalidEmailThenApplicationShouldRespondToInvalidEmailAddress() {
        String expectedTitle = "Metacube Software";
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, expectedTitle);
    }

    @Test
    public void GivenEmailAddressTextBoxOnMyAccountWhenProvideValidButAlreadyUsedEmailThenApplicationShouldRespondToAcceptEmailButDisplayValidationMessage() {
        String expectedTitle = "Metacube Software";
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, expectedTitle);
    }

    @Test
    public void GivenEmailAddressTextBoxOnMyAccountWhenProvideValidUserEmailThenApplicationShouldAcceptAndRenderCreateAnAccountPage() {
        String expectedTitle = "Metacube Software";
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, expectedTitle);
    }
}

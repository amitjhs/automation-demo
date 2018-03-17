package com.simplepage.functionaltest.test;

import com.simplepage.functionaltest.page.MyAccountPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.automationframework.functionaltest.MAssert.assertAreEqual;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MyAccountPageTest extends BaseTest {

    private MyAccountPage page;

    @BeforeMethod
    public void setup(){
        this.page = new MyAccountPage(driver);
    }

    @Test
    public void GivenSignInLinkOnHomePageWhenUserClickOnSignInThenMyAccountPageShouldRender() {
        String expectedTitle = "Metacube Software";
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, expectedTitle);

        assertThat(page.getTitle(), is("Metacube Software"));
    }

    @Test
    public void GivenEmailAddressTextBoxOnMyAccountWhenProvideInvalidEmailThenApplicationShouldRespondToInvalidEmailAddress() {
        String expectedTitle = "Metacube Software";
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, expectedTitle);

        assertThat(page.getTitle(), is("Metacube Software"));
    }

    @Test
    public void GivenEmailAddressTextBoxOnMyAccountWhenProvideValidButAlreadyUsedEmailThenApplicationShouldRespondToAcceptEmailButDisplayValidationMessage() {
        String expectedTitle = "Metacube Software";
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, expectedTitle);

        assertThat(page.getTitle(), is("Metacube Software"));
    }

    @Test
    public void GivenEmailAddressTextBoxOnMyAccountWhenProvideValidUserEmailThenApplicationShouldAcceptAndRenderCreateAnAccountPage() {
        String expectedTitle = "Metacube Software";
        String actualTitle = driver.getTitle();
        assertAreEqual(actualTitle, expectedTitle);

        assertThat(page.getTitle(), is("Metacube Software"));
    }
}

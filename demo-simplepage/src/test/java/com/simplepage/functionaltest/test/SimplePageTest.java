package com.simplepage.functionaltest.test;

import com.simplepage.functionaltest.page.SimplePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimplePageTest extends BaseTest {

    private SimplePage page;

    @BeforeMethod
    public void setup(){
        this.page = new SimplePage(driver);
    }

    @Test
    public void GivenSignInLinkOnHomePageWhenUserClickOnSignInThenMyAccountPageShouldRender() {
        assertThat(page.getTitle(), is("Metacube Software"));
    }

}

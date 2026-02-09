package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin("invalid_user@test.com", "wrongPassword123");
        
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message should be displayed for invalid credentials");
        String actualError = loginPage.getErrorMessage();
        Assert.assertTrue(actualError.contains("check your username and password"), "Incorrect error message displayed");
    }
}

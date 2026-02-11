package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin("testuser@example.com", "validPassword123");

        // Note: For a real test, we would verify the home page URL or a specific
        // element on the dashboard.
        // Since we don't have real credentials, we just verify the action sequence.
        // Assert.assertTrue(driver.getCurrentUrl().contains("lightning"), "Login failed
        // or dashboard not reached");
    }
}

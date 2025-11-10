package com.infrd.tests;

import com.infrd.base.BaseTest;
import com.infrd.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        LoginPage lp = new LoginPage(driver);
        lp.login("student", "Password123");

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("logged-in-successfully"), "Login failed");
    }
}

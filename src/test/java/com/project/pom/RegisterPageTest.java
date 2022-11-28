package com.project.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterPageTest {

    private WebDriver driver;
    RegisterPage registerPage;

    @Before
    public void setUp() throws Exception {
        registerPage = new RegisterPage(driver);
        driver = registerPage.chromeDriverConnection();
        registerPage.visit("https://demo.guru99.com/test/newtours/register.php");
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        registerPage.registerUSer();
        assertEquals("Note: Your user name is Jacobo2017.",registerPage.registeredMessage());
    }
}
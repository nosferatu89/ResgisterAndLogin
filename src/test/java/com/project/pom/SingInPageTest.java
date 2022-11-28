package com.project.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SingInPageTest {

    private WebDriver driver;
    SingInPage singInPage;

    @Before
    public void setUp() throws Exception {
        singInPage = new SingInPage(driver);
        driver = singInPage.chromeDriverConnection();
        singInPage.visit("https://demo.guru99.com/test/newtours/index.php");
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        singInPage.signIn();
        Thread.sleep(2000);
        //assertTrue(singInPage.isHomePageDisplayed());
        //assertEquals("Login Successfully",singInPage.homepageLocator());
    }

}
package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends Base{

    By userLocator = By.name("userName");
    By passwordLocator = By.name("password");
    By signInBtnLocator = By.name("submit");

    By homepageLocator = By.xpath("");

    public SingInPage(WebDriver driver) {
        super(driver);
    }

    public void signIn(){

        if (isDisplayed(userLocator)){
            type("Jacobo2017",userLocator);
            type("12345",passwordLocator);
            click(signInBtnLocator);
    } else {
            System.out.println("username textbox was not present");
        }
    }

    public boolean isHomePageDisplayed(){

        return isDisplayed(homepageLocator);
    }

}

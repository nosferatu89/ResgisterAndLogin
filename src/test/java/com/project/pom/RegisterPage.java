package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterPage extends Base {

    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");

    By usernameLocator = By.id("email");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");

    By registerBtnLocator = By.name("submit");

    By registeredMessage = By.tagName("font");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUSer() throws InterruptedException {
        click(registerLinkLocator);
        Thread.sleep(2000);
        if (isDisplayed(registerPageLocator)){
            type("Jacobo2017",usernameLocator);
            type("12345",passwordLocator);
            type("12345",confirmPasswordLocator);

            click(registerBtnLocator);
        }else{
            System.out.println("Register page was not found");
        }
    }

    public String registeredMessage(){
        List<WebElement> fonts =  findElements(registeredMessage);
        return getText(fonts.get(5));
    }

}

package com.pragmatic.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage
{

        //Define the elements
        @FindBy(xpath = "//input[@id='txtUsername']")
        WebElement txtUsername;

        @FindBy(xpath ="//div[@id='divPassword']/input")
        WebElement txtPassword;

        @FindBy(xpath = "//*[@id='btnLogin']")
        WebElement btnLogin;

        @FindBy(xpath = "//*[@id=\"spanMessage\"]")
        WebElement megError;
        @FindBy


        //Add actions

        public Loginpage typeUsername (String username)
        {
            txtUsername.sendKeys(username);
            return this;

        }

        public Loginpage typePassword(String password){
            txtPassword.sendKeys(password);
            return this;
        }
//test
        public Loginpage clickLoginButtonFailure(){
            btnLogin.click();
            return this;
        }

        public String getError(){
            return megError.getText();
        }

        public Loginpage clickButtonSuccess(){
            return megError.getText();
        }





    }


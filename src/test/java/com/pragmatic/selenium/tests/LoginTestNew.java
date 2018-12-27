package com.pragmatic.selenium.tests;

import com.pragmatic.selenium.pages.Loginpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestNew extends TestBase {

    @Test
    public void testLoginWithBlankUserName() {
        Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
        loginpage.typeUsername("").typePassword("Ptl@#321").clickLoginButtonFailure();
        Assert.assertEquals(loginpage.getError(), "Username cannot be empty");
    }

    @Test
    public void testLoginWithBlankPassword(){
        Loginpage loginpage= PageFactory.initElements(driver,Loginpage.class);
        loginpage.typeUsername("Admin").typePassword("").clickLoginButtonFailure();
        Assert.assertEquals(loginpage.getError(), "Password cannot be empty");
    }

    @Test
    public void testInvalidPassword(){
        Loginpage loginpage=PageFactory.initElements(driver,Loginpage.class);
        loginpage.typeUsername("Admin").typePassword("test").clickLoginButtonFailure();
        Assert.assertEquals(loginpage.getError(),"Incorrect credentials");
    }

    @Test
    public void testLoginWithSuccessCredentials(){
        Loginpage loginpage=PageFactory.initElements(driver,Loginpage.class);
        loginpage.typeUsername("Admin").typePassword("Ptl@#321").cli
    }


        }


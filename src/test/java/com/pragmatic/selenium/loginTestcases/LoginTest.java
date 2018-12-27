package com.pragmatic.selenium.loginTestcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    public static final String BASE_URL = "http://hrm.pragmatictestlabs.com";

    @BeforeMethod
    public void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterMethod

    public void afterMethod() {
        //driver.close();
    }


    @Test

    public void testValidLogin() {

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Ptl@#321");
        driver.findElement(By.id("btnLogin")).click();
        String welcomeMessage = driver.findElement(By.id("welcome")).getText();
        Assert.assertEquals(welcomeMessage, "Welcome Admin");
    }

    @Test

    public void testInvalidPassword()

    {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("test@#321");
        driver.findElement(By.id("btnLogin")).click();
        String errorMessage = driver.findElement(By.id("spanMessage")).getText();
        Assert.assertEquals(errorMessage, "Invalid credentials");
    }

    @Test

    public void testInvaldUsername()

    {
        driver.findElement(By.id("txtUsername")).sendKeys("test");
        driver.findElement(By.id("txtPassword")).sendKeys("Ptl@#321");
        driver.findElement(By.id("btnLogin")).click();
        String errorMessage = driver.findElement(By.id("spanMessage")).getText();
        Assert.assertEquals(errorMessage, "Invalid credentials");
    }

    @Test

    public void testcaseSensitive()

    {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Ptl@#321");
        driver.findElement(By.id("btnLogin")).click();
        String welcomeMessage = driver.findElement(By.id("welcome")).getText();
        Assert.assertEquals(welcomeMessage, "Welcome Admin");
    }


    public void testcaseSensitivePassword()

    {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("ptl@#321");
        driver.findElement(By.id("btnLogin")).click();
        String errorMessage = driver.findElement(By.id("spanMessage")).getText();
        Assert.assertEquals(errorMessage, "Invalid credentials");
    }








}

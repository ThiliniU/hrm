package com.pragmatic.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloSelenium {

    //First selenium script



    @Test
    public void testHelloSelenium()
    {
        //Open an instance target browser


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();


        //Type the URL in Address bar

        driver.get("http://hrm.pragmatictestlabs.com");


        // Wait till the page is loaded
        //This will be taken care bey Seenium with get method



        //Do something with the page
        //Type username
        WebElement txtUsername = driver.findElement(By.id("txtUsername"));
        txtUsername.clear();
        txtUsername.sendKeys("Admin");

        //Type password

        driver.findElement(By.name("txtPassword")).sendKeys("Ptl@#321");

        //Click on the login button

        driver.findElement(By.id("btnLogin")).click();

        //Set a delay

        //Thread.sleep(5000);




        //Verify the output

        String welcomeMessage =driver.findElement(By.id("welcome")).getText();
        Assert.assertEquals(welcomeMessage, "Welcome Admin");



        //Close the browser

        //driver.close();

    }
}

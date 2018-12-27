package com.pragmatic.selenium.exsamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptsPopups
{

    WebDriver webDriver;

    @BeforeMethod
public void beforeMethod()
        {
            WebDriverManager.chromedriver().setup();
            webDriver=new ChromeDriver();
            webDriver.navigate().to("http://demosite.pragmatictestlabs.com/Alerts.html");



        }



    //@Test
//    public void  testsAsert() {
//        webDriver.findElement(By.xpath("//button[contains(text(),Simple Alert')]")).click();
////Switch to the Alert
//        Alert alert = webDriver.switchTo().alert();
//        Assert.assertEquals(alert.getText(), "This is Simple Alert");
//        alert.accept();
//        Assert.assertEquals(webDriver.findElement(By.id("confirm-demo")).getText(), "Alert is gone");

    //}

   @Test
        public void testTimingAlert()
        {
            webDriver.findElement(By.xpath("//button[contains(text(),'Timing Alert')]")).click();
            //Explicit wait
            WebDriverWait wait=new WebDriverWait(webDriver ,30);
            wait.until(ExpectedConditions.alertIsPresent());

           Alert alert = webDriver.switchTo().alert();
           alert.accept();
           Assert.assertEquals(webDriver.findElement(By.id("confirm-demo")).getText(),"0");


        }
    }


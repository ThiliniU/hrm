package com.pragmatic.selenium.exsamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class DragAndDropExsamples
{
    @Test
    public void testDragAndDrop()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver= new ChromeDriver();
        webDriver.get("http://demosite.pragmatictestlabs.com/Droppable.html");

        WebElement sourceElement=webDriver.findElement(By.id("draggableview"));
        WebElement targetElement=webDriver.findElement(By.id("droppableview"));

        //Droping an element to a target

        Actions actions = new Actions(webDriver);
        actions.dragAndDrop(sourceElement,targetElement)
                .build()
                .perform();



    }
}

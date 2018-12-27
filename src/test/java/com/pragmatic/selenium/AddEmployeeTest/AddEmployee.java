package com.pragmatic.selenium.AddEmployeeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddEmployee {

        WebDriver driver;
        public static final String BASE_URL = "http://hrm.pragmatictestlabs.com";

        @BeforeMethod
        public void beforeMethod() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(BASE_URL);
            login();
        }

        @AfterMethod
        public void afterMethod() {
            //driver.close();
        }


        public void login() {

            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
            driver.findElement(By.id("txtPassword")).sendKeys("Ptl@#321");
            driver.findElement(By.id("btnLogin")).click();
        }


        @Test
        public void addEmployee() {
            driver.findElement(By.id("menu_pim_viewPimModule")).click();
            driver.findElement(By.id("menu_pim_addEmployee")).click();
            driver.findElement(By.id("firstName")).sendKeys( "Marie");
            driver.findElement(By.id("middleName")).sendKeys( "Andrea");
            driver.findElement(By.id("lastName")).sendKeys( "Taehyung");
            String strEmployeeID= driver.findElement(By.id("employeeId")).getAttribute( "value");
           // Assert.assertTrue( "strEmployeeID".length()==4);

            //file upload
            driver.findElement(By.id("photofile")).sendKeys("D:\\selenium\\TestData\\Pics\\sri-lanka-flag-211-p_1.png");

            //click checkboxes
            if (driver.findElement(By.id("chkLogin")).isSelected()==false)
            {
                driver.findElement(By.id("chkLogin")).click();
            }

            Select lstStatus =(new Select(driver.findElement(By.id("status"))));
            lstStatus.selectByIndex(0);


            //username

            driver.findElement(By.id("user_name")).sendKeys("Mariee");
            driver.findElement(By.id("user_password")).sendKeys("Ptl@#321");
            driver.findElement(By.id("re_password")).sendKeys("Ptl@#321");

            //savebutton
            driver.findElement(By.id("btnSave")).click();

            //compare added values

            String strFirstName= driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute( "Marie");
            String midName= driver.findElement(By.id("personal_txtEmpMiddleName")).getAttribute("Andrea");
            String lstName =driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("Taehyung");
           // char empId = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute






        }
    }





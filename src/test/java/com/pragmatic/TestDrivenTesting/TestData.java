package com.pragmatic.TestDrivenTesting;

import org.testng.annotations.DataProvider;

public class TestData
{

    @DataProvider(name = "invalid_login_details")
            public static Object[][] invalidLoginDetails()
{
    return new Object[][]
            {
                    {"Admin","","Password cannot be blank"},
                    {"","","Username cannot be blank"},
                    {"Admin","ptl@#321","Invalid credentials"},
                    {"Admin","Test","Invalid credentials"}

            };


}

}



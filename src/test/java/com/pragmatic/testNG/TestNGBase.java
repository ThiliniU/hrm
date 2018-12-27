package com.pragmatic.testNG;

import org.testng.annotations.Test;

public class TestNGBase
{
    @Test
    public void beforeSuite()
    {
        System.out.println("TestNGBase.beforeSuite");
    }

    @Test
    public void afterSuite()
    {
        System.out.println("TestNGBase.afterSuite");
    }
}
